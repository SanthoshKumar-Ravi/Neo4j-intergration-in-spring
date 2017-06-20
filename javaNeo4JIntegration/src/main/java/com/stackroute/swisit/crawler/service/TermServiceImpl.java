package com.stackroute.swisit.crawler.service;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.stereotype.Service;

import com.stackroute.swisit.crawler.CoreCrawlerMainApplication;
import com.stackroute.swisit.crawler.Repository.TermRepository;
import com.stackroute.swisit.crawler.domain.Term;

@Service
public class TermServiceImpl implements TermService {

	
	@Autowired
	private TermRepository termRepository;
	
	private final static Logger log = LoggerFactory.getLogger(CoreCrawlerMainApplication.class);
	
	
	public List<Term> getTerms() {
		return termRepository.findTerms();

	}
		



	
	

}
