package com.accp.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({MybatisConfiguration.class})
@EnableTransactionManagement //启用源注解的事务
@ComponentScan
public class AppConfigurationmy {
	
}
