package ex01Ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxSend")
public class ex01AjaxSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// CORS --> 웹페이지간에 데이터를 주고받을 때 정해져있는 정책
		// * 동일 출처 정책
		// 5500포트 ---> 8081포트 데이터 요청 / 허용x
		response.addHeader("Access-Control-Allow-Origin", "*");
		// ---> cross origin defense 풀어주는 방법
		
		// 요청받은 데이터 꺼내오기
		String data = request.getParameter("data");
		System.out.println("요청받은 데이터 >> " + data);
		
		// ajax통신에서 응답을 되돌려주기!!
		// --> 화면에 되돌려줄 데이터를 출력해주기
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// JSON형식으로 데이터를 돌려주자!
		// 1. 일일히 하나씩 문자열로 지정
		out.print("{\"name\":\"김운비\"}");
		
		// 2. 라이브러리 사용하는 방식
		// ---> GSON라이브러리 나중에 사용해보자!
		
		
		
		
		
	}

}
