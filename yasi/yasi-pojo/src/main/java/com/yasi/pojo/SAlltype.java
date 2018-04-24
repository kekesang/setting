package com.yasi.pojo;

public class SAlltype {
    private String typeId;

    private String typeName;

    private String typeParent;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeParent() {
        return typeParent;
    }

    public void setTypeParent(String typeParent) {
        this.typeParent = typeParent == null ? null : typeParent.trim();
    }
}