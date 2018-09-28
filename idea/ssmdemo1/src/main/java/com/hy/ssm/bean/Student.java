package com.hy.ssm.bean;

public class Student {
    private Integer stuNo;
    private String stuName;
    private String sex;
    private Integer[] ids;
    private String sex1;
    private Classes cla;
    private Integer classno;

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    public Classes getCla() {
        return cla;
    }

    public void setCla(Classes cla) {
        this.cla = cla;
    }

    public String getSex1() {
        return sex1;
    }

    public void setSex1(String sex1) {
        this.sex1 = sex1;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
