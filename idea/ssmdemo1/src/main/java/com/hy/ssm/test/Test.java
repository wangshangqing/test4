package com.hy.ssm.test;

import com.hy.ssm.mapper.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper dao=(StudentMapper)app.getBean("studentMapper");
        /*Classes c=new Classes();
        c.setClassname("高级运维班");*/
       // dao.insert(c);
        /*QueryWrapper wrapper=new QueryWrapper<Classes>();
        wrapper.eq("classname","测试班");*/

       /* IPage<Classes> page=dao.selectPage(new Page<Classes>(1,3).setCurrent(1).setSize(2),new QueryWrapper<Classes>());
        page.setCurrent(1);
        page.setSize(3);
        System.out.print(page.getRecords());*/
        dao.queryAllStudent();
    }
}
