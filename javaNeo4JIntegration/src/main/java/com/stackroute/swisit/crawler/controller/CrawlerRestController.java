package com.stackroute.swisit.crawler.controller;


import java.io.IOException;
import java.util.List;

import com.stackroute.swisit.crawler.service.TermService;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.stackroute.swisit.crawler.domain.Term;

@RestController
@RequestMapping(value="/crawl")
public class CrawlerRestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private TermService termService;
	
	@Autowired
	public void setTermService(TermService termService){
		this.termService=termService;
	}	
	
	
	String data;

	


	@RequestMapping("/terms")
	public String receiveMessage() throws JsonParseException, JsonMappingException, IOException{
		System.out.println("Inside RestController");
		List<Term> termList = termService.getTerms();
		for (Term term : termList) {
			System.out.println("Term name: " +  term.getName());
		}
		return null;
	}

	
	
}
