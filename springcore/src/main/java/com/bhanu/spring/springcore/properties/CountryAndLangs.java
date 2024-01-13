package com.bhanu.spring.springcore.properties;

import java.util.Properties;

public class CountryAndLangs {
	private Properties countriesAndLangs;

	public Properties getCountriesAndLangs() {
		return countriesAndLangs;
	}

	public void setCountriesAndLangs(Properties countriesAndLangs) {
		this.countriesAndLangs = countriesAndLangs;
	}

	@Override
	public String toString() {
		return "CountryAndLangs [countriesAndLangs=" + countriesAndLangs + "]";
	}
	
}
