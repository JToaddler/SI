package com.madlabs.mdfs.watchman.test4;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component("composer")
public class Composer {

	@ServiceActivator
	public void composeMail() {
		System.out.println("composing mail for notification");
	}

}
