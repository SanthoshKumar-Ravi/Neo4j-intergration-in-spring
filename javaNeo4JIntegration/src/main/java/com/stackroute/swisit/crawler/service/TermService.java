package com.stackroute.swisit.crawler.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stackroute.swisit.crawler.domain.Term;


public interface TermService {
//
	List<Term> getTerms();
}
