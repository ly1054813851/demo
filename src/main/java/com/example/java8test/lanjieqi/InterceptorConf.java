package com.example.java8test.lanjieqi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author：ly
 * @Data :14:34 2022/1/7
 **/
@Configuration
public class InterceptorConf implements WebMvcConfigurer {

    @Autowired
    private TestInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(interceptor)
                .addPathPatterns("/"); //拦截的路径
                //.excludePathPatterns() 不拦截的路径
    }
}
