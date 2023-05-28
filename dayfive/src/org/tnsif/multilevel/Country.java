//program to demonstrate hierarchical inheritance
package org.tnsif.multilevel;

public class Country {
	private String CountryName;
	private String CountryCapital;
	//getter and setter
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCountryCapital() {
		return CountryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		CountryCapital = countryCapital;
	}
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + ", CountryCapital=" + CountryCapital + "]";
	}
	

}
