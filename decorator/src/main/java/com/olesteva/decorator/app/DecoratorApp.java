package com.olesteva.decorator.app;

import com.olesteva.decorator.addons.CaramelDecorator;
import com.olesteva.decorator.addons.SoyDecorator;
import com.olesteva.decorator.beverage.Beverage;
import com.olesteva.decorator.beverage.Espresso;

/**
 * Main class simulating usage of decorator pattern
 */
public class DecoratorApp {

  public static void main(String[] args) {

    Beverage espresso = Espresso.of(2);

    Beverage caramelDecorator = CaramelDecorator.of(2, espresso);
    Beverage soyDecorator = SoyDecorator.of(1, caramelDecorator);

    int cost = soyDecorator.cost();

    System.out.println("Final cost for your drink is: " + cost);

  }
}
