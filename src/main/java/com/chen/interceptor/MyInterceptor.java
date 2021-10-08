package com.chen.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//自定义拦截器
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //设定哪些页面是直接放行的
        if(request.getRequestURI().contains("/login")){
            return true;
        }
        //用户登陆了，session中存有用户信息时，放行
        if(session.getAttribute("userLoginInfo")!=null){
            return true;
        }

        //其余请求拦截，转发回登陆页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
