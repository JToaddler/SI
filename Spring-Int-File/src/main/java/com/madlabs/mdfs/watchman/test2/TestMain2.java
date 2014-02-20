package com.madlabs.mdfs.watchman.test2;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain2 {

	public static void main(String[] args) {

		final AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/integration/local-file2.xml");
		Test testcomponent = context.getBean("test", Test.class);
		List<String> names = Arrays.asList(context.getBeanDefinitionNames());

		for (String name : names) {

			System.out.println(name);

		}
	}
}
