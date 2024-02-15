package com.bhanu.springaop.product;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int m1, int m2) {
		return m1*m2;
	}

}
