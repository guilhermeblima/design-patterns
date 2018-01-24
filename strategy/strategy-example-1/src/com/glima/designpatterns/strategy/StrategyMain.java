package com.glima.designpatterns.strategy;

import com.glima.designpatterns.strategy.service.UserAccount;
import com.glima.designpatterns.strategy.service.UserAccountStrategy;

import java.util.Scanner;

/**
 * Created by Guilherme on 24/01/2018.
 */
public class StrategyMain {

    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Please select your account: 1 - Free, 2 - Premium, 3 - Deluxe. ");
            int optionSelected = scanner.nextInt();
            UserAccount userAccount = UserAccount.values()[(optionSelected - 1)];

            UserAccountStrategy strategy = userAccount.getFeatures();

            System.out.println(strategy.findFeatures());

        }

    }
}
