package com.olesteva.decorator.beverage;

/**
 * Base case beverage
 */
public class Espresso implements Beverage {

  private final int price;

  private Espresso(int price) {
    this.price = price;
  }

  public static Espresso of(int cost) {
    System.out.println("Preparing espresso ...");
    return new Espresso(cost);
  }

  @Override
  public int cost() {
    return price;
  }

  @Override
  public String description() {
    return "Espresso drink";
  }
}
