package com.olesteva.adapter;

/**
 * Existing implementation that needs to be used but it's interface {@link Person} is not compatible
 * with new expected one {@link Employee}
 */
public class PersonImpl implements Person {

  private String name;

  @Override
  public String getFirstName() {
    return name;
  }

  @Override
  public void setFirstName(String name) {
    this.name = name;
  }
}
