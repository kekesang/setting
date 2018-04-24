package com.yasi.pojo;

import java.util.Date;

public class SClass {
    private String classNo;

    private String className;

    private Integer classPrice;

    private Integer classNums;

    private String classTeano;

    private String classAddress;

    private Date classBegin;

    private Date classEnd;

    private String classCno;

    private String classStatus;

    private Date createTime;

    private Integer classTotal;

    private Integer classIn;

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo == null ? null : classNo.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(Integer classPrice) {
        this.classPrice = classPrice;
    }

    public Integer getClassNums() {
        return classNums;
    }

    public void setClassNums(Integer classNums) {
        this.classNums = classNums;
    }

    public String getClassTeano() {
        return classTeano;
    }

    public void setClassTeano(String classTeano) {
        this.classTeano = classTeano == null ? null : classTeano.trim();
    }

    public String getClassAddress() {
        return classAddress;
    }

    public void setClassAddress(String classAddress) {
        this.classAddress = classAddress == null ? null : classAddress.trim();
    }

    public Date getClassBegin() {
        return classBegin;
    }

    public void setClassBegin(Date classBegin) {
        this.classBegin = classBegin;
    }

    public Date getClassEnd() {
        return classEnd;
    }

    public void setClassEnd(Date classEnd) {
        this.classEnd = classEnd;
    }

    public String getClassCno() {
        return classCno;
    }

    public void setClassCno(String classCno) {
        this.classCno = classCno == null ? null : classCno.trim();
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus == null ? null : classStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getClassTotal() {
        return classTotal;
    }

    public void setClassTotal(Integer classTotal) {
        this.classTotal = classTotal;
    }

    public Integer getClassIn() {
        return classIn;
    }

    public void setClassIn(Integer classIn) {
        this.classIn = classIn;
    }
}