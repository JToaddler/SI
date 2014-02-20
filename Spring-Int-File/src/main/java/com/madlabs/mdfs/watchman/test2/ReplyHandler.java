package com.madlabs.mdfs.watchman.test2;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component("replyHandler")
public class ReplyHandler {

	@ServiceActivator
	public void displayTest() {
		System.out.println("file moved to target directory");
	}
}
