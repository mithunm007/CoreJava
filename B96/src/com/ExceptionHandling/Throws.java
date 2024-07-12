package com.ExceptionHandling;

import java.io.IOException;


public class Throws {
	void display() throws IOException, ArithmeticException{
		//throws keyword is used during method declaration
		throw new ArithmeticException();
		//throw new IOException();
	}
}
