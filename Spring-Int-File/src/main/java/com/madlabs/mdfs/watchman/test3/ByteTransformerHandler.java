package com.madlabs.mdfs.watchman.test3;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component("byteTransformerHandler")
public class ByteTransformerHandler {

	@ServiceActivator
	public byte[] byteHandler(byte[] inputFile) {
		
		System.out.println("File is about to be moved . size = "
				+ inputFile.length);
		
		return inputFile;
	}
}
