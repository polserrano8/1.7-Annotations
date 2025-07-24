package org.example;

import org.example.model.DeprecatedMethodsTrial;
import org.example.model.OnlineWorker;
import org.example.model.PresentialWorker;

public class Main {
    public static void main(String[] args) {
        PresentialWorker johnBurrows = new PresentialWorker("John","Burrows",30.0,120,200);
        OnlineWorker janaMayer = new OnlineWorker("Jana", "Mayer", 50.0, 50, 150);
        System.out.println("The wage of the two workers are...");
        System.out.println(johnBurrows.wageCalculation());
        System.out.println(janaMayer.wageCalculation());
        System.out.println("Both objects have the same method implemented differently, and the results showcases that the override annotation works.");

        DeprecatedMethodsTrial trial = new DeprecatedMethodsTrial();
        System.out.println("A deprecated method is being used and the result is...");
        trial.deprecatedMethodUse(johnBurrows);

    }
}