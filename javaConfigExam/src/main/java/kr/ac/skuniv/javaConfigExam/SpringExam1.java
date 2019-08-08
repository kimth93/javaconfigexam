package kr.ac.skuniv.javaConfigExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExam1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		myBean bean = context.getBean(myBean.class);
		
		
		bean.setName("kim");
		System.out.println(bean.getName());
		
	}

}
