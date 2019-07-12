package com.olesteva.decorator.beverage;

/**
 * Base case beverage
 */
public class Decaf implements Beverage {

  private final int price;

  private Decaf(int price) {
    this.price = price;
  }

  public static Decaf of(int price) {
    System.out.println("Preparing decaf ...");
    return new Decaf(price);
  }

  @Override
  public int cost() {
    return price;
  }

  @Override
  public String description() {
    return "Decaf drink";
  }
}
