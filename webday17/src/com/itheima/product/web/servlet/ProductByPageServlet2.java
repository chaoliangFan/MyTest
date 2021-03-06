package com.itheima.product.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.PageBean;
import com.itheima.product.service.ProductService;

/**
 * Servlet implementation class ProductByPageServlet
 */
public class ProductByPageServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String strCurrPage = request.getParameter("currPage");
			if(strCurrPage == null) {
				strCurrPage = "1";
			}
			String pageSize = request.getParameter("pageSize");
			ProductService productService = new ProductService();
			PageBean pageBean = productService.findByPage2(strCurrPage,pageSize);
			request.setAttribute("pageBean", pageBean);
			request.getRequestDispatcher("/jsp/productByPage_list2.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
