package com.mvc.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.ws.Response;

public class GoodsVO {
//	장바구니번호 / 회원이름 / 상품코드  /가격  / 수량  / 입력날짜(오늘날짜) 
	private String myCartNum;
	private String memberName;
	private String goodsCode;
	private int goodsPrice;
	private int goodsAmount;
	private Date date;
	
	public String getMyCartNum() {
		return myCartNum;
	}
	public void setMyCartNum(String myCartNum) {
		this.myCartNum = myCartNum;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsAmount() {
		return goodsAmount;
	}
	public void setGoodsAmount(int goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
