package com.example.demo.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyZuulFilter extends ZuulFilter{
	 
	private static Logger log = LoggerFactory.getLogger(MyZuulFilter.class);
	 
	/**
	 * 逻辑判断是否过滤，true，永远过滤
	 * */
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 过滤器的具体逻辑规则，可用非常复杂的sql,nosql去判断是否有权限访问
	 * 
	 * */
	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //判断参数中是否包含token，如果不包含返回token is empty
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;

	}

	/***
	 * 返回过滤器的类型
	 * @return 
	 * 		pre：路由之前
	 *		routing：路由之时
	 *		post： 路由之后
	 *		error：发送错误调用
	 * */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	/**
	 * 过滤的顺序
	 * */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
