package com.hackathon3.back_server.api;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class KoscomApi {

	public static String search(String code) throws IOException {
		
		StringBuilder urlBuilder = new StringBuilder("https://sandbox-apigw.koscom.co.kr/v2/market/stocks/{marketcode}/lists".replace("{marketcode}", URLEncoder.encode("kospi", "UTF-8")));
	    urlBuilder.append("?");
	    urlBuilder.append(URLEncoder.encode("apikey","UTF-8") + "=" + URLEncoder.encode("l7xxc460c2c4fca442ebaef0e2d8977dc043", "UTF-8"));
	    URL url = new URL(urlBuilder.toString());
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
//	    System.out.println("Response code: " + conn.getResponseCode());
	    BufferedReader rd;
	    if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    } else {
	        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	    }
	    StringBuilder sb = new StringBuilder();
	    String line;
	    while ((line = rd.readLine()) != null) {
	        sb.append(line);
	    }
	    rd.close();
	    conn.disconnect();
//	    System.out.println(sb.toString());
	    
	    int index = sb.toString().indexOf(code);
//	    System.out.println(index);
	    int start = sb.toString().indexOf("isuKorNm", index);
	    int end = sb.toString().indexOf("isuKorAbbr", index);
	    String name = sb.toString().substring(start+11, end-3);
//	    System.out.println(name);
	    
		return name;
	    
	}
}
