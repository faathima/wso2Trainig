package com.IPLocationFinderWS;
import net.webservicex.*;

public class IPLocationFinderWS {

	public static void main(String[] args) {
		
		Currency B= Currency.fromValue("ALL");
		Currency AFA = null;
		
		currnecyCon(B ,AFA);
	}
	public static double currnecyCon(Currency ALL , Currency AFA){

		CurrencyConvertor currency =new CurrencyConvertor();
		CurrencyConvertorSoap currencySoap= currency.getCurrencyConvertorSoap();
		double c= currencySoap.conversionRate(ALL, AFA);
		return c;
	}
	
	}


