package com.demo;

import org.springframework.stereotype.Component;

/**
 * Created by mymac on 01/04/2018.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
