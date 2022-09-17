package com.example.tpcampete.entity;

public class Registration {
    private String parentName, parentTel, parentEmail, childName, childAge;
    private Integer programId;

    public Registration() {
    }

    public Registration(String parentName, String parentTel, String parentEmail, String childName, String childAge, Integer programId) {
        this.parentName = parentName;
        this.parentTel = parentTel;
        this.parentEmail = parentEmail;
        this.childName = childName;
        this.childAge = childAge;
        this.programId = programId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentTel() {
        return parentTel;
    }

    public void setParentTel(String parentTel) {
        this.parentTel = parentTel;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildAge() {
        return childAge;
    }

    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "parentName='" + parentName + '\'' +
                ", parentTel='" + parentTel + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                ", childName='" + childName + '\'' +
                ", childAge='" + childAge + '\'' +
                ", programId=" + programId +
                '}';
    }
}
