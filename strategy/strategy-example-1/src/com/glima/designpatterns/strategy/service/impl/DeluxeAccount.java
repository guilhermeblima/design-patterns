package com.glima.designpatterns.strategy.service.impl;

import com.glima.designpatterns.strategy.service.UserAccountStrategy;

/**
 * Created by Guilherme on 24/01/2018.
 */
public class DeluxeAccount implements UserAccountStrategy {

    @Override
    public String findFeatures() {
        return "You have unlimited downloads per day";
    }
}
