package com.hy.test01.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hy.test01.bean.Sp;
import com.hy.test01.dao.StudentDao;

public class AddServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String sname=req.getParameter("sname");
		String price=req.getParameter("price");
		
		StudentDao dao=new StudentDao();
		Sp sp=new Sp();
		sp.setSname(sname);
		sp.setPrice(Float.parseFloat(price));
		dao.addGoods(sp);
		resp.sendRedirect("a");
	}

}
