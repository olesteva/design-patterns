package com.olesteva.state;

public class UberTripFacade {

  private final UberTrip uberTrip;

  public UberTripFacade(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  public void startTripcinu(){
    uberTrip.setCurrentState(uberTrip.getStateContext().getTripRequestedState());

    uberTrip.requestTrip();
    uberTrip.doPayment();
    uberTrip.completeTrip();
    uberTrip.evaluateDriver();
  }
}
