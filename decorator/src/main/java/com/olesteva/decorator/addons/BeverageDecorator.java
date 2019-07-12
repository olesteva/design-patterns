package com.olesteva.decorator.addons;

import com.olesteva.decorator.beverage.Beverage;

public interface BeverageDecorator extends Beverage {

  @Override
  default String description(){
    return "decorator addon ...";
  }
}
