package com.olesteva.state.states;

import com.olesteva.state.State;
import com.olesteva.state.UberTrip;

public class TripRequested implements State {

  private final UberTrip uberTrip;

  public TripRequested(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  @Override
  public void handleTripRequest() {
    System.out.println("trip requested ...");
    if(!uberTrip.tripStarted()) {
      System.out.println("switched to payment stated ...");
      uberTrip.setCurrentState(uberTrip.getStateContext().getPaymentState());
    }
  }
}
