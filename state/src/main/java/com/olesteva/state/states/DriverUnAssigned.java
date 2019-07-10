package com.olesteva.state.states;

import com.olesteva.state.State;
import com.olesteva.state.UberTrip;

public class DriverUnAssigned implements State {

  private UberTrip uberTrip;

  public DriverUnAssigned(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  @Override
  public void handleDriverEvaluation() {
    System.out.println("driver evaluation ...");
    uberTrip.setCurrentState(uberTrip.getStateContext().getTripEndState());
    System.out.println("ended trip state ...");
  }
}
