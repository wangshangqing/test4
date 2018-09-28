package com.hy.ssm.service;

import com.hy.ssm.bean.Student;
import com.hy.ssm.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "StudentService")
public class StudentServiceImpl implements IStudentService{
    @Resource(name="studentMapper")
    private StudentMapper stuMapper;

    public StudentMapper getStuMapper() {
        return stuMapper;
    }

    public void setStuMapper(StudentMapper stuMapper) {
        this.stuMapper = stuMapper;
    }

    public List<Student> queryAll() {
        return stuMapper.queryAllStudent();
    }
}
