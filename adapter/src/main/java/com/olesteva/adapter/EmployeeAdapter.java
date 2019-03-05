package com.olesteva.adapter;

/**
 * Implementation of {@link Employee} by using existing one {@link Person}
 */
public class EmployeeAdapter implements Employee {

  /**
   * use composition to inject existing interface
   */
  private final Person person;

  public EmployeeAdapter(Person person) {
    this.person = person;
  }

  @Override
  public String getName() {
    // at run time delegates call to existing implementation
    return person.getFirstName();
  }
}
