package com.testing;

//Imported Packages
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	@Value("${message}")
	String messageFromConfigFile;
	
	//
	public Hello() {
		System.out.println("Hello Class is Loaded" + messageFromConfigFile);
	}
	
	public void display() {
		System.out.println(messageFromConfigFile);
	}

}
