package springmvcexample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is PreHandler");
		
		String name = request.getParameter("user");
		if(name.startsWith("m"))
		{
			response.setContentType("text/html");
			response.getWriter().println("<h1>Name should not start wuth ....... m</h1>");
			return false;
		}
		
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
			System.out.println("this is post handler ");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
			System.out.println("this is after completion method..");
	}
	
	
	
}
