package com.bhanu.spring.springcoreadvanced.propertiesplaceholder;

public class MyDAO {

	private String dbServer;

	public MyDAO(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}
	
}
