package com.yasi.pojo;

public class SCourse {
    private String cNo;

    private String cName;

    private String cMajor;

    private String cAid;

    private String cContent;

    private String cCateno;

    private String cType;

    private Integer cPrice;

    private Integer cDprice;

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo == null ? null : cNo.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcMajor() {
        return cMajor;
    }

    public void setcMajor(String cMajor) {
        this.cMajor = cMajor == null ? null : cMajor.trim();
    }

    public String getcAid() {
        return cAid;
    }

    public void setcAid(String cAid) {
        this.cAid = cAid == null ? null : cAid.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getcCateno() {
        return cCateno;
    }

    public void setcCateno(String cCateno) {
        this.cCateno = cCateno == null ? null : cCateno.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public Integer getcDprice() {
        return cDprice;
    }

    public void setcDprice(Integer cDprice) {
        this.cDprice = cDprice;
    }
}