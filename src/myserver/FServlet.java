package myserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class FServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("dd");
		

		String jsonStr = "{\"name\":\"fly\",\"type\":\"虫子\"}";
//		PrintWriter out = null;
//		try {
//		    out = resp.getWriter();
//		    out.write(jsonStr);
//		} catch (IOException e) {
//		    e.printStackTrace();
//		} finally {
//		    if (out != null) {
//		        out.close();
//		    }
//		}
		
	 	String str = "result";
		byte[] bytes = jsonStr.getBytes("UTF-8");
		resp.getOutputStream().write(bytes);
	//	super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}

	
	
	
}
