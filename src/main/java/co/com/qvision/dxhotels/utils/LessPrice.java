package co.com.qvision.dxhotels.utils;

import java.util.ArrayList;

public class LessPrice {
	static double value=0;
	private static String retun;
	
	public static String lessPrice(ArrayList<String> values ) 
	{
		value=Double.parseDouble(values.get(0).replace("$", ""));
		for (int i = 0; i < values.size(); i++) {
			if ( Double.parseDouble(values.get(i).replace("$", ""))<value ) {
				retun=values.get(i);
				}
		}
		System.out.println(retun.replace("$", ""));

		return retun.replace("$", "").trim();			
	}

}
