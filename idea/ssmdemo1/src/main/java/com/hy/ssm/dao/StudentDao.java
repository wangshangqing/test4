package com.hy.ssm.dao;

import com.hy.ssm.bean.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentDao extends SqlSessionDaoSupport implements IStudentDao{
    private SqlSessionFactory sqlSessionFactory;

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<Student> queryAll() {
        return this.getSqlSession().selectList("student.queryAllStudent");
    }

    public void insert(){
        sqlSessionFactory.openSession().insert("");
    }
}
