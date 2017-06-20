package com.stackroute.swisit.crawler.Repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.stackroute.swisit.crawler.domain.Term;

public interface TermRepository extends GraphRepository <Term>{
	@org.springframework.data.neo4j.annotation.Query("MATCH (n:`Term`) RETURN n")
	List<Term> findTerms();


	
     }
