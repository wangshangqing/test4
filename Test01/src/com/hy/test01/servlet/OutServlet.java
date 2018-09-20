package com.hy.test01.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hy.test01.bean.Sp;
import com.hy.test01.dao.StudentDao;

public class OutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		StudentDao dao=new StudentDao();
		List<Sp> list=dao.queryAllSp();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("dopost");
	}
	
}
