package com.mvc.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MarketController {
	
	
	@RequestMapping(value="param3.do", method = RequestMethod.GET)
	public ModelAndView param3(GoodsVO goodsVO, ModelAndView modelAndView) {
		
		System.out.println("카드번호 : "+goodsVO.getMyCartNum());
		System.out.println("회원이름 : "+ goodsVO.getMemberName());
		System.out.println("상품코드 : "+goodsVO.getGoodsCode());
		System.out.println("상품가격 : "+goodsVO.getGoodsPrice());
		System.out.println("상품수량 : "+goodsVO.getGoodsAmount());
		
		Date now = new Date();
		SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("오늘날짜 : "+day.format(now));
		 
		modelAndView.setViewName("market");
		return modelAndView;
	}
}
