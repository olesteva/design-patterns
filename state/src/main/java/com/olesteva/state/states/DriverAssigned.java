package com.olesteva.state.states;

import com.olesteva.state.State;
import com.olesteva.state.UberTrip;

public class DriverAssigned implements State {

  private final UberTrip uberTrip;

  public DriverAssigned(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  @Override
  public void handleDriverCancellation() {
    System.out.println("Driver canceled, switching to tripRequested state ...");
    uberTrip.setCurrentState(uberTrip.getStateContext().getTripRequestedState()); // If driver cancels, go back to trip requested state & try again.
  }

  @Override
  public void completeTrip() {
    System.out.println("Complete trip..., switching to driverUnassigned state ...");
    uberTrip.setCurrentState(uberTrip.getStateContext().getDriverUnassignedState()); // Call driver unassigned state
  }
}
