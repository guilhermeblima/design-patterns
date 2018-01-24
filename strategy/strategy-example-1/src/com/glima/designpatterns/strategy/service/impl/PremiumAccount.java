package com.glima.designpatterns.strategy.service.impl;

import com.glima.designpatterns.strategy.service.UserAccountStrategy;

/**
 * Created by Guilherme on 24/01/2018.
 */
public class PremiumAccount implements UserAccountStrategy {
    @Override
    public String findFeatures() {
        return "You can download 10 songs per day";
    }
}
