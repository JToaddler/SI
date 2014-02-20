package com.madlabs.mdfs.watchman.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/integration/local-file.xml");

		TestComponent testcomponent = context.getBean("testComponent",
				TestComponent.class);
		testcomponent.simpleTest();
	}
}
