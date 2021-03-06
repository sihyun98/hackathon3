package com.hackathon3.back_server.dto.stock;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class StockSearchResponseDto {
	
	private Long id;
	private String balanceNo;		
	private String firmNm;
	private String stockNm;
	private int qty;
	private int valTrade;
	private int valCur;
	private double earningRate;
	private String assertType;
	private String isuSrtCd;
	private String isuKorNm;
	
	private int valEvalu;
	private int profit;

}
