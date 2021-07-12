package com.xhh.onlineMall.config;

import com.xhh.onlineMall.Interceptor.CheckTokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * token校验拦截器java配置类
 * 拦截器实现WebMvcConfigurer
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private CheckTokenInterceptor checkTokenInterceptor;

    /**
     * 重新addInterceptors
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(checkTokenInterceptor)
                .addPathPatterns("/shopcart/**")//受限
                .addPathPatterns("/orders/**")//受限
                .addPathPatterns("/useraddr/**")
                .excludePathPatterns("user/**");//忽略

    }
}
