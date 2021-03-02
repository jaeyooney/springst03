package com.mvcproject.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvcproject.member.controller.model.dao.MemberDao;
import com.mvcproject.member.controller.model.service.MemberService;
import com.mvcproject.member.controller.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="memberList.do", method = RequestMethod.GET)
	public ModelAndView memberListService(ModelAndView modelAndView)throws Exception{
		
		List<Member> memberList = memberService.selectMemberAll();
		
		
		//memberList의 데이터 갯수 만큼 반복
		//memberList.size()
//		for(int i=0; i<memberList.size(); i++) {	
//			//System.out.println(i);
//			Member member = memberList.get(i);
//			System.out.println((i+1) + "번째 이름 :" + member.getName());
//		}
		
		modelAndView.addObject("memberList",  memberList); //memberList 키와 벨류값으로 저장
		modelAndView.setViewName("member/memberList"); //memberList.jsp에서 보여줘~
		
		return modelAndView;	//modelAndView 객체에 데이터를 저장해서 리턴
		
	}
	@RequestMapping(value="memberView.do", method = RequestMethod.GET)
	public String memberViewService(@RequestParam("id") String id, Model model)throws Exception{
		
		Member member = memberService.selectMember(id);
		model.addAttribute("member", member);	//modelAndView와 달리 여기서 데이터를 저장
		
		return "member/memberView";				//보여줄 페이지만 리턴
	}
	@RequestMapping(value="memberDel.do", method = RequestMethod.GET)	
	//@GetMapping //@PostMapping 도 사용가능
	public ModelAndView deleteMember(Member member, ModelAndView modelAndView) throws Exception {
		 int cnt = memberService.deleteMember(member);
		 
		 modelAndView.addObject("cnt", cnt);
//		 System.out.println(cnt);
		modelAndView.setViewName("member/memberDelComplete");
		
		return modelAndView;
	}
	
	@RequestMapping(value="memberIns.do", method = RequestMethod.GET)
	public ModelAndView memberInsForm(Member member, ModelAndView modelAndView) throws Exception {
		
		modelAndView.setViewName("member/memberInsForm");
		return modelAndView;
	}
	@RequestMapping(value="memberIns.do", method = RequestMethod.POST)
	public ModelAndView memberIns(Member member, ModelAndView modelAndView) throws Exception {
		int cnt = memberService.insertMember(member);
		modelAndView.addObject("cnt",cnt);
		modelAndView.setViewName("member/memberInsComplete");
		System.out.println(cnt);
		return modelAndView;
	}
	@RequestMapping(value="memberUpt.do", method=RequestMethod.GET)
	public ModelAndView memberUptForm(@RequestParam("id") String id,ModelAndView modelAndView) throws Exception{
		Member member = memberService.selectMember(id);
		modelAndView.addObject("member", member);
		modelAndView.setViewName("member/memberUptForm");
		return  modelAndView;
	}
	@RequestMapping(value="memberUpt.do", method=RequestMethod.POST)
	public ModelAndView memberUpt(Member member, ModelAndView modelAndView) throws Exception {
		int cnt = memberService.updateMember(member);
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("member/memberUptComplete");
		
		return  modelAndView;
	}
}
	


