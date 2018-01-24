package com.glima.designpatterns.strategy.service;

import com.glima.designpatterns.strategy.service.impl.DeluxeAccount;
import com.glima.designpatterns.strategy.service.impl.FreeAccount;
import com.glima.designpatterns.strategy.service.impl.PremiumAccount;

/**
 * Created by Guilherme on 24/01/2018.
 */
public enum UserAccount {

        FREE_ACCOUNT{
            @Override
            public UserAccountStrategy getFeatures() {
                return new FreeAccount();
            }
        },
        PREMIUM_ACCOUNT{
            @Override
            public UserAccountStrategy getFeatures() {
                return new PremiumAccount();
            }
        },
        DELUXE_ACCOUNT{
            @Override
            public UserAccountStrategy getFeatures() {
                return new DeluxeAccount();
            }
        };

    public abstract UserAccountStrategy getFeatures();
}
