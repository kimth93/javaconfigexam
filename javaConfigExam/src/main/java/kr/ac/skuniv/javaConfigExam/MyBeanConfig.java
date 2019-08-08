package kr.ac.skuniv.javaConfigExam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {
	@Bean
	public myBean mybean() {
		return new myBean();			//<bean id ="mybean" class="kr.ac.skuniv.springexam.myBean"/>와 같다

	}
	@Bean
	public myBean mybean2() {
		
		myBean bean = new myBean();
		bean.setName("lee");
		return bean;
	}

}
