package com.example.calc;

import org.springframework.stereotype.Component;

@Component
public class Property {
	
	public int value1;
	  public int value2;
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}

}
