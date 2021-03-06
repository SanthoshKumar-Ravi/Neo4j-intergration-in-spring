package com.stackroute.swisit.crawler.domain;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Simanta.Sarma on 17-06-2017.
 */
@NodeEntity
public class Intent {
    @GraphId
    private Long id;
    public Intent(){}

    @Relationship(type = "indicatorOf", direction = Relationship.UNDIRECTED)
    private Set<Term> terms;

    public void indicatorOf(Term term) {
        if (terms == null) {
            terms = new HashSet<>();
        }
        terms.add(term);
    }
    public Intent(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}
