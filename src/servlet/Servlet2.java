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
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private final String nameAddWord = " ：１０年後";
	private final int ageAddNumber = 10;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		UserInfoBean userInfoBean = new UserInfoBean();

		userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");

		// 名前の結合処理
		userInfoBean.addName(nameAddWord);
		// 年齢の加算処理
		userInfoBean.addAge(ageAddNumber);
		// 趣味の結合処理
		userInfoBean.concateHobby(userInfoBean.getHobby1(),
								  userInfoBean.getHobby2(),
								  userInfoBean.getHobby3());

 		// 次サーブレットへフォワード）
		RequestDispatcher dispatch = request.getRequestDispatcher("Jsp1.jsp");
		dispatch.forward(request, response);

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
