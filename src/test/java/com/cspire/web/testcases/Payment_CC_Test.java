package com.cspire.web.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cspire.web.base.TestBase;

public class Payment_CC_Test extends TestBase {

	public Payment_CC_Test() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() {
		initialization();
	}
	public void tc1() {
		System.out.println("Mamoni");
	}
	@AfterMethod
	public void TearDown() {
		tearDown();
}
}