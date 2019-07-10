package com.olesteva.state.states;

import com.olesteva.state.State;
import com.olesteva.state.UberTrip;

public class CustomerCancelled implements State {

  private final UberTrip uberTrip;

  public CustomerCancelled(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  @Override
  public void handleCustomerCancellation() {
    uberTrip.setCurrentState(uberTrip.getStateContext().getDriverUnassignedState()); // If customer cancels, unassign the driver & related stuffs.
  }
}
