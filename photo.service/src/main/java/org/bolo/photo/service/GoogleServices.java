package org.bolo.photo.service;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class GoogleServices {
	public static void main(String[] aa) throws Exception{
		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyAg7ZoORXv7d2eMGKb-pB7_QZReIPiIzxw");
		GeocodingResult[] results =  GeocodingApi.geocode(context,
		    "spino d'adda").await();
		System.out.println(results);
		
	}
	
}
