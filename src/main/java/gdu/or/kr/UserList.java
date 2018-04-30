package gdu.or.kr;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class UserList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBCon CON = new DBCon();
		SqlSessionFactory sqlSessionFactory = CON.getConn();
		SqlSession session = sqlSessionFactory.openSession(true);
		
		List<HashMap<String, Object>> LiST = session.selectList("user.selectUser");
//		for (int i = 0; i < LiST.size(); i++) {
//			System.out.println(LiST.get(i));
//		} >> 이건 콘솔에 띄우기 위한 용도.
		request.setAttribute("LIST", LiST);
		RequestDispatcher DIS = request.getRequestDispatcher("UserList.jsp");
		DIS.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
