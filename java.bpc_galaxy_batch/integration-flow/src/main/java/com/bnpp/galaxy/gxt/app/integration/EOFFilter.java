package com.bnpp.galaxy.gxt.app.integration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.integration.file.filters.FileListFilter;


public class EOFFilter implements FileListFilter<File> {

	private Predicate<File> predicateEOF;

	public EOFFilter(Predicate<File> predicateEOF) {
		this.predicateEOF = predicateEOF;
	}

	@Override
	public List<File> filterFiles(File[] files) {
		List<File> list = new ArrayList<>();
		for (File file : files) {

			if (predicateEOF.test(file)) {
				list.add(file);
			}
		}
		return list;
	}

}
