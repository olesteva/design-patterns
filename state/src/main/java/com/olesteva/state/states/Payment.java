package com.olesteva.state.states;

import com.olesteva.state.State;
import com.olesteva.state.UberTrip;

public class Payment implements State {

  private boolean success = false;

  private final UberTrip uberTrip;

  public Payment(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  @Override
  public void handleTripRequest() {
    throw new RuntimeException("not supported ...");
  }

  @Override
  public void handlePaymentRequest() {
    System.out.println("handling payment ...");
    Payment payment = doPayment();
    if(payment.isSuccess()) {
      System.out.println("payment success, switching to driverAssigned state ...");
      uberTrip.setCurrentState(uberTrip.getStateContext().getDriverAssignedState()); // Call driver assigned state.
    } else {
      System.out.println("payment failed, switching to tripRequest state ...");
      uberTrip.setCurrentState(uberTrip.getStateContext().getTripRequestedState()); // Call trip requested state
    }
  }

  public boolean isSuccess() {
    return success;
  }

  private Payment doPayment(){
    System.out.println("creating payment ... (always success, this needs to be extended to full functionality)");
    this.success = true;
    return this;
  }
}
