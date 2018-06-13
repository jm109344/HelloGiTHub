package com.jm109344.hello;

import java.io.IOException;
import java.io.OutputStream;

public class Third {
	private final String theMsg;

	public String getTheMsg() {
		return theMsg;
	}

	public Third() {
		this("Hello World v3");
	}

	public Third(String msg) {
		theMsg = msg;
	}
	
	public void printMsg(OutputStream output) {
		try {
			output.write(theMsg.getBytes());
			output.write(System.lineSeparator().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
