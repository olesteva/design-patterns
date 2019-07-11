package com.olesteva.decorator.addons;

import com.olesteva.decorator.beverage.Beverage;

/**
 * Decorator for adding caramel
 */
public class CaramelDecorator implements Beverage {

  private final int price;
  private Beverage beverageToDecorate;

  private CaramelDecorator(int price, Beverage beverageToDecorate) {
    this.price = price;
    System.out.println("Adding caramel to you beverage ...");
    this.beverageToDecorate = beverageToDecorate;
  }

  public static CaramelDecorator of(int price, Beverage beverageToDecorate) {
    return new CaramelDecorator(price, beverageToDecorate);
  }

  @Override
  public int cost() {
    return beverageToDecorate.cost() + price;
  }
}
