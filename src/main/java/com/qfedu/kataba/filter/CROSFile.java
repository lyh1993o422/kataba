package com.qfedu.kataba.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 17:36
 * description:实现CROS 跨域访问
 */

@WebFilter("/*")
public class CROSFile implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
