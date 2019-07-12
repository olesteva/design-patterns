package com.olesteva.decorator.addons;

import com.olesteva.decorator.beverage.Beverage;

/**
 * Decorator for adding soy
 */
public class SoyDecorator implements BeverageDecorator {

  private final int price;
  private Beverage beverageToDecorate;

  private SoyDecorator(int price, Beverage beverageToDecorate) {
    this.price = price;
    System.out.println("Adding soy to your beverage ...");
    this.beverageToDecorate = beverageToDecorate;
  }

  public static SoyDecorator of(int price, Beverage beverageToDecorate) {
    return new SoyDecorator(price, beverageToDecorate);
  }

  @Override
  public int cost() {
    return beverageToDecorate.cost() + price;
  }
}
