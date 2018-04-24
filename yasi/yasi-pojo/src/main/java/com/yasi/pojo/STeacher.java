package com.yasi.pojo;

public class STeacher {
    private String teaNo;

    private String teaName;

    private String teaMajor;

    public String getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(String teaNo) {
        this.teaNo = teaNo == null ? null : teaNo.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaMajor() {
        return teaMajor;
    }

    public void setTeaMajor(String teaMajor) {
        this.teaMajor = teaMajor == null ? null : teaMajor.trim();
    }
}