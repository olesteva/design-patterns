package com.olesteva.adapter;

public class AdapterTest {

  public static void main(String[] args) {

    Person person = new PersonImpl();
    person.setFirstName("olesteva");

    EmployeeAdapter employeeAdapter = new EmployeeAdapter(person);

    doTestAdapter(employeeAdapter);


  }


  /**
   * Simulates module which uses new target interface
   */
  static void doTestAdapter(Employee employee) {

    System.out.println("Hello ... " + employee.getName());
  }
}
