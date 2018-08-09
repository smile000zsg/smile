package com.accp.spring;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;

@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfiguration extends WebMvcConfigurerAdapter{
	//配置视图解析器
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB/INF/");
		resolver.setSuffix(".jsp");
		registry.viewResolver(resolver);
		super.configureViewResolvers(registry);
	}
	//配置静态资源访问<mvc:default-servlet-handler />
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		super.configureDefaultServletHandling(configurer);
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		{
			//String转换器
			StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("utf-8"));
			List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
			//设置响应头编码，text/html;charset=utf-8
			supportedMediaTypes.add(new MediaType(MediaType.TEXT_HTML, Charset.defaultCharset()));
			converter.setSupportedMediaTypes(supportedMediaTypes);
			converters.add(converter);
		}
		
		{
			//配置fastjson
			FastJsonHttpMessageConverter4 converter4 = new FastJsonHttpMessageConverter4();
			//设置编码
			converter4.setDefaultCharset(Charset.forName("utf-8"));
			FastJsonConfig fastJsonConfig = new FastJsonConfig();
//			fastJsonConfig.setDateFormat("yyy-MM-dd");
			converter4.setFastJsonConfig(fastJsonConfig);
			converters.add(converter4);
		}
		super.configureMessageConverters(converters);
	}
}
