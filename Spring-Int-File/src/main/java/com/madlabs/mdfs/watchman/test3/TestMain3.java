package com.madlabs.mdfs.watchman.test3;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/integration/file-transformer-byte.xml");
		List<String> names = Arrays.asList(context.getBeanDefinitionNames());
		for (String name : names) {
			System.out.println(name);
		}
	}
}
