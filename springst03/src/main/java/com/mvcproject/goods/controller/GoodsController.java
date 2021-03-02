package com.mvcproject.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvcproject.goods.controller.model.service.GoodsService;
import com.mvcproject.goods.controller.model.vo.Goods;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value="goodsList.do", method = RequestMethod.GET)
	public ModelAndView goodsListService(ModelAndView modelAndView) throws Exception{
		
		List<Goods> goodsList = goodsService.selectGoodsAll();
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.setViewName("/goods/goodsList");
		return modelAndView;
		
	}
}
