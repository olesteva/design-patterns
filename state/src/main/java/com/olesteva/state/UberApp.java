package com.olesteva.state;

public class UberApp {

  public static void main(String[] args) {
    UberTrip uberTrip = new UberTrip();
    UberTripFacade uberTripFacade = new UberTripFacade(uberTrip);

    uberTripFacade.startTripcinu();
  }
}
