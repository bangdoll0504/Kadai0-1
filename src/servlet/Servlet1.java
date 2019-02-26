package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UserInfoBean;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();
		UserInfoBean userInfoBean = new UserInfoBean();

		try {

		userInfoBean.setName(request.getParameter("name"));
		userInfoBean.setAge(Integer.parseInt(request.getParameter("age")));
		userInfoBean.setHobby1(request.getParameter("hobby1"));
		userInfoBean.setHobby2(request.getParameter("hobby2"));
		userInfoBean.setHobby3(request.getParameter("hobby3"));
		session.setAttribute("userInfoBean", userInfoBean);

		// 次サーブレットへフォワード）
		RequestDispatcher dispatch = request.getRequestDispatcher("Servlet2");
		dispatch.forward(request, response);

		} catch(NumberFormatException e) {
			response.sendRedirect("error.html");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
