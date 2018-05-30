package com.spittr.service;

import com.spittr.ro.Spitter;
import com.spittr.repo.SpitterRepository;
import org.springframework.stereotype.Component;

@Component
public class ProperSpitter implements SpitterRepository {
    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        return new Spitter("iromfeed", "123456", "Chino", "Wang", "iromfeed@gmail.com");
    }
}
