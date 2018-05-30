package com.spittr.service;

import com.spittr.ro.Spittle;
import com.spittr.repo.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class ProperSpittle implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle(new Date(),"Spittle " + i,
                    new Random(i).nextDouble(), new Random(i).nextDouble()));
        }
        return spittles;
    }

    @Override
    public Spittle findOne(long id) {
        return new Spittle(new Date(), "Hello, World");
    }
}
