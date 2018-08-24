package com.bon.common.config;

import com.bon.common.interceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: bon基础项目
 * @description: config配置
 * @author: Bon
 * @create: 2018-05-10 15:38
 **/
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    //关键，将拦截器作为bean写入配置中
    @Bean
    public Interceptor myInterceptor(){
        return new Interceptor();
    }

    @Autowired
    private YamlConfig config;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/swagger-resources").excludePathPatterns("/v2/*").excludePathPatterns("/configuration/*");
        super.addInterceptors(registry);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(config.getMapProps().get("corsHost"))
                .allowedMethods("GET", "POST")
                .allowCredentials(true).maxAge(3600);
    }

}
