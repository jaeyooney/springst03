package com.mvc.file.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ReportSubmissionController {
	@RequestMapping(value="/report/submission.do", method=RequestMethod.GET)
	public String form() {
		return "report/submissionForm";
	}
	@RequestMapping(value="/report/submitReport1.do", method=RequestMethod.POST)
	public String submitReport1(
			@RequestParam("studentNumber") String studentNumber,
			@RequestParam("report") MultipartFile report) throws Exception{
		
		report.transferTo(new File("C:\\Users\\jaeyoon\\git\\repository3\\springst03\\src\\main\\webapp\\resources\\img\\" + report.getName()));
		
		return "report/submissionComplete";
	}
}
