package gdu.or.kr;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BoardInsert extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				request.setCharacterEncoding("UTF-8");
				String TITLE = request.getParameter("title");
				String CONTENT = request.getParameter("content");
				String REGUSER = request.getParameter("regUser");
				System.out.println(TITLE + "\n" + CONTENT +  "\n" + REGUSER);
				
				HashMap<String, Object> MAP = new HashMap<String, Object>();
				MAP.put("title", TITLE);
				MAP.put("content", CONTENT);
				MAP.put("regUser", REGUSER);
				System.out.println(MAP);
				
				DBCon CON = new DBCon();
				SqlSessionFactory sqlSessionFactory = CON.getConn();
				SqlSession session = sqlSessionFactory.openSession(true);
				int CNT = session.insert("user.insertBoard", MAP);
				System.out.println(CNT);
	}

}
