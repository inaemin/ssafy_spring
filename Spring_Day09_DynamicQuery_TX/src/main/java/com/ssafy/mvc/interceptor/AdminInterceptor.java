package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class AdminInterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse reponse, Object )
			throws Exception {
		HttpSession session = request.getSession();
		if (!session.getAttribute("loginUser").equals("admin")); {
			reponse.sendRedirect("list");
			return false;
		}
		return true;
	}
}
