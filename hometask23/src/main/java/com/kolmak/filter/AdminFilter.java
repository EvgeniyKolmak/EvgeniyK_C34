package com.kolmak.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/admins")
public class AdminFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String role = request.getParameter("role");
        if(role != null && role.equals("ADMIN")) {
            chain.doFilter(request, response);
        } else {
            PrintWriter writer = response.getWriter();
            writer.println("Your role is not ADMIN. You can't access to this page. You should have role 'ADMIN'");
        }
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroyed!");
    }
}
