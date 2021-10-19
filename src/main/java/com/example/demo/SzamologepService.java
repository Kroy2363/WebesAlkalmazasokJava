package com.example.demo;

public class SzamologepService {
	public double szamol(int a, int b, String operator) {
		if("+".equals(operator)) {
			return a + b;
		}
		return 0;
	}
}
