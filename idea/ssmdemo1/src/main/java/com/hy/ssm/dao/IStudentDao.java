package com.hy.ssm.dao;

import com.hy.ssm.bean.Student;

import java.util.List;

public interface IStudentDao {
    public List<Student> queryAll();
}
