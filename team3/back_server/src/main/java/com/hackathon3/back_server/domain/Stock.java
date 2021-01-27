package com.hackathon3.back_server.domain;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Stock {
	
	private @Id @GeneratedValue @Column(name = "stock_id") Long id;
	private String balanceNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")	
	private Member member;
	
//	private Long memberId;
	
	private String isuSrtCd; //주식코드
	private String firmNm; //증권사이름
	private String stockNm; //주식이름
	private int qty; // 종목 수
	private int valTrade; // 매입가
	private int valCur; // 현재가
	private double earningRate; // 수익률
	private String assertType;
	
	@Override
	public String toString() {
	    return "Stock{" + "id=" + this.id + ", balanceNo='" + this.balanceNo + '\''
	    		+ ", firmNm='" + this.firmNm + '\'' + ", stockNm='" + this.stockNm + '\'' 
	    		+ ", qty='" + this.qty + '\'' + ", valTrade='" + this.valTrade + '\''
	    		+ ", valCur='" + this.valCur + '\''
	    		+ ", earningRate='" + this.earningRate + '\'' + ", earningRate='" + this.earningRate + '\'' 
	    		+ ", assertType='" + this.assertType + '}';
	}

}
