package com.hy.ssm.controller;

import com.hy.ssm.bean.Student;
import com.hy.ssm.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource(name = "StudentService")
    private IStudentService studentService;
    public IStudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/queryAll.action")
    @ResponseBody
    public List<Student> queryAll(){
        System.out.print("----------------------");
        return studentService.queryAll();
    }

    public static void main(String[] args) {
        PreparedStatement preparedStatement;
    }

}
