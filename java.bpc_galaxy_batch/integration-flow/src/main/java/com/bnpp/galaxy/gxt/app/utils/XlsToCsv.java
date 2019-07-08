package com.bnpp.galaxy.gxt.app.utils;

import com.opencsv.CSVWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class XlsToCsv {

    private static Logger LOG = LogManager.getLogger(XlsToCsv.class);

    private Path      xlsFilePath;
    private Path      outputDir;
    private CsvConfig csvConfig;

    private XlsToCsv(Path xlsFilePath, Path outputDir, CsvConfig csvConfig) {
        this.xlsFilePath = xlsFilePath;
        this.outputDir = outputDir;
        this.csvConfig = csvConfig;
    }

    public static Path generateCsv(Path xlsFilePath, Path outputDir, CsvConfig csvConfig) throws IOException {
        Objects.requireNonNull(xlsFilePath);
        Objects.requireNonNull(outputDir);
        Objects.requireNonNull(csvConfig);
        XlsToCsv xlsToCsv = new XlsToCsv(xlsFilePath, outputDir, csvConfig);
        List<String[]> csv = xlsToCsv.toCsv();
        Path filePath = xlsToCsv.createFile();
        return xlsToCsv.writeCsv(csv, filePath);
    }

    private Path writeCsv(List<String[]> csv, Path filePath) throws IOException {
        CSVWriter csvWriter = new CSVWriter(new FileWriter(filePath.toString()), csvConfig.separator, CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.NO_ESCAPE_CHARACTER, CSVWriter.RFC4180_LINE_END);
        csvWriter.writeAll(csv);
        csvWriter.close();
        return filePath;
    }

    private Path createFile() throws IOException {
        Files.createDirectories(outputDir);
        String filename = xlsFilePath.getFileName().toString().replaceFirst("xlsx?", "csv");
        Path newFile = outputDir.resolve(filename);
        Files.deleteIfExists(newFile);
        Files.createFile(newFile);
        return newFile;
    }

    private List<String[]> toCsv() throws IOException {
        try (InputStream input = new FileInputStream(xlsFilePath.toFile())) {
            Workbook workbook = WorkbookFactory.create(input);
            return mapToCsv(workbook.getSheetAt(0));
        }
    }

    private List<String[]> mapToCsv(Sheet sheet) {
        int lastRowNum = sheet.getLastRowNum();
        List<String[]> csv = new ArrayList<>(lastRowNum - csvConfig.columnOffset);
        for (int i = csvConfig.rowOffset; i < lastRowNum; i++) {
            Row row = sheet.getRow(i);
            int lastCell = row.getLastCellNum();
            String[] csvLine = new String[lastCell - csvConfig.columnOffset];
            for (int j = csvConfig.columnOffset; j < lastCell; j++) {
                Cell cell = row.getCell(j);
                csvLine[j - csvConfig.columnOffset] = getCellValue(cell);
            }
            csv.add(csvLine);
        }
        return csv;
    }

    private String getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case NUMERIC:
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    return new CellDateFormatter(cell.getCellStyle().getDataFormatString())
                            .format(cell.getDateCellValue());
                }
                return String.valueOf(cell.getNumericCellValue());
            case STRING:
                return cell.getStringCellValue();
            case BLANK:
                return "";
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
        }
        throw new RuntimeException("Unhandled xsl cell type : " + cell.getCellType());
    }

    public static class CsvConfig {

        int  rowOffset;
        int  columnOffset;
        char separator;

        public CsvConfig() {
        }

        public CsvConfig(char separator, int rowOffset, int columnOffset) {
            this.separator = separator;
            this.rowOffset = rowOffset;
            this.columnOffset = columnOffset;
        }
    }

}
