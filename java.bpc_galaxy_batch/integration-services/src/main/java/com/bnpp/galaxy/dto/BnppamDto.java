package com.bnpp.galaxy.dto;

import java.util.Objects;

public class BnppamDto {

    private String assetCategoryLevel;
    private String codePortfolio;
    private String operationDate;
    private String valueDate;
    private String executionDate;
    private String codeIsin;
    private String currencySettle;
    private String sideBs;
    private Double quantity;
    private Double price;
    private Double interetAccrue;
    private Double brutAmount;
    private Double courtageAmount;
    private Double netAmount;
    private String contrapartie;
    private String contrapartieLibel;
    private String reference;
    private String comment;

    public BnppamDto() {
    }

    public BnppamDto(String assetCategoryLevel, String codePortfolio, String operationDate, String valueDate, String executionDate, String codeIsin, String currencySettle, String sideBs, double quantity, double price, double interetAccrue, double brutAmount, double courtageAmount, double netAmount, String contrapartie, String contrapartieLibel, String reference, String comment) {
        this.assetCategoryLevel = assetCategoryLevel;
        this.codePortfolio = codePortfolio;
        this.operationDate = operationDate;
        this.valueDate = valueDate;
        this.executionDate = executionDate;
        this.codeIsin = codeIsin;
        this.currencySettle = currencySettle;
        this.sideBs = sideBs;
        this.quantity = quantity;
        this.price = price;
        this.interetAccrue = interetAccrue;
        this.brutAmount = brutAmount;
        this.courtageAmount = courtageAmount;
        this.netAmount = netAmount;
        this.contrapartie = contrapartie;
        this.contrapartieLibel = contrapartieLibel;
        this.reference = reference;
        this.comment = comment;
    }

    public String getAssetCategoryLevel() {
        return assetCategoryLevel;
    }

    public void setAssetCategoryLevel(String assetCategoryLevel) {
        this.assetCategoryLevel = assetCategoryLevel;
    }

    public String getCodePortfolio() {
        return codePortfolio;
    }

    public void setCodePortfolio(String codePortfolio) {
        this.codePortfolio = codePortfolio;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    public String getCodeIsin() {
        return codeIsin;
    }

    public void setCodeIsin(String codeIsin) {
        this.codeIsin = codeIsin;
    }

    public String getCurrencySettle() {
        return currencySettle;
    }

    public void setCurrencySettle(String currencySettle) {
        this.currencySettle = currencySettle;
    }

    public String getSideBs() {
        return sideBs;
    }

    public void setSideBs(String sideBs) {
        this.sideBs = sideBs;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getInteretAccrue() {
        return interetAccrue;
    }

    public void setInteretAccrue(Double interetAccrue) {
        this.interetAccrue = interetAccrue;
    }

    public Double getBrutAmount() {
        return brutAmount;
    }

    public void setBrutAmount(Double brutAmount) {
        this.brutAmount = brutAmount;
    }

    public Double getCourtageAmount() {
        return courtageAmount;
    }

    public void setCourtageAmount(Double courtageAmount) {
        this.courtageAmount = courtageAmount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public String getContrapartie() {
        return contrapartie;
    }

    public void setContrapartie(String contrapartie) {
        this.contrapartie = contrapartie;
    }

    public String getContrapartieLibel() {
        return contrapartieLibel;
    }

    public void setContrapartieLibel(String contrapartieLibel) {
        this.contrapartieLibel = contrapartieLibel;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BnppamDto bnppamDto = (BnppamDto) o;
        return Objects.equals(assetCategoryLevel, bnppamDto.assetCategoryLevel) &&
                Objects.equals(codePortfolio, bnppamDto.codePortfolio) &&
                Objects.equals(operationDate, bnppamDto.operationDate) &&
                Objects.equals(valueDate, bnppamDto.valueDate) &&
                Objects.equals(executionDate, bnppamDto.executionDate) &&
                Objects.equals(codeIsin, bnppamDto.codeIsin) &&
                Objects.equals(currencySettle, bnppamDto.currencySettle) &&
                Objects.equals(sideBs, bnppamDto.sideBs) &&
                Objects.equals(quantity, bnppamDto.quantity) &&
                Objects.equals(price, bnppamDto.price) &&
                Objects.equals(interetAccrue, bnppamDto.interetAccrue) &&
                Objects.equals(brutAmount, bnppamDto.brutAmount) &&
                Objects.equals(courtageAmount, bnppamDto.courtageAmount) &&
                Objects.equals(netAmount, bnppamDto.netAmount) &&
                Objects.equals(contrapartie, bnppamDto.contrapartie) &&
                Objects.equals(contrapartieLibel, bnppamDto.contrapartieLibel) &&
                Objects.equals(reference, bnppamDto.reference) &&
                Objects.equals(comment, bnppamDto.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetCategoryLevel, codePortfolio, operationDate, valueDate, executionDate, codeIsin, currencySettle, sideBs, quantity, price, interetAccrue, brutAmount, courtageAmount, netAmount, contrapartie, contrapartieLibel, reference, comment);
    }

    @Override
    public String toString() {
        return "BnppamRow{" +
                "assetCategoryLevel='" + assetCategoryLevel + '\'' +
                ", codePortfolio='" + codePortfolio + '\'' +
                ", operationDate='" + operationDate + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", executionDate='" + executionDate + '\'' +
                ", codeIsin='" + codeIsin + '\'' +
                ", currencySettle='" + currencySettle + '\'' +
                ", sideBs='" + sideBs + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", interetAccrue='" + interetAccrue + '\'' +
                ", brutAmount='" + brutAmount + '\'' +
                ", courtageAmount='" + courtageAmount + '\'' +
                ", netAmount='" + netAmount + '\'' +
                ", contrapartie='" + contrapartie + '\'' +
                ", contrapartieLibel='" + contrapartieLibel + '\'' +
                ", reference='" + reference + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

}
