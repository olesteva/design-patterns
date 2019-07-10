package com.olesteva.state.factory;

import com.olesteva.state.State;
import com.olesteva.state.UberTrip;
import com.olesteva.state.states.CustomerCancelled;
import com.olesteva.state.states.DriverAssigned;
import com.olesteva.state.states.DriverUnAssigned;
import com.olesteva.state.states.Payment;
import com.olesteva.state.states.TripEndState;
import com.olesteva.state.states.TripRequested;

public class StateContext {

  private final UberTrip uberTrip;

  // states
  private State tripRequestedState;
  private State paymentState;
  private State driverAssignedState;
  private State driverUnassignedState;
  private State customerCancelledState;
  private State tripEndState;


  private StateContext(UberTrip uberTrip) {
    this.uberTrip = uberTrip;
  }

  public static StateContext of(UberTrip uberTrip) {
    StateContext stateContext = new StateContext(uberTrip);
    stateContext.tripRequestedState = new TripRequested(uberTrip);
    stateContext.paymentState = new Payment(uberTrip);
    stateContext.driverAssignedState = new DriverAssigned(uberTrip);
    stateContext.driverUnassignedState = new DriverUnAssigned(uberTrip);
    stateContext.customerCancelledState = new CustomerCancelled(uberTrip);
    stateContext.tripEndState = new TripEndState(uberTrip);
    return stateContext;
  }

  public UberTrip getUberTrip() {
    return uberTrip;
  }

  public State getTripRequestedState() {
    return tripRequestedState;
  }

  public State getPaymentState() {
    return paymentState;
  }

  public State getDriverAssignedState() {
    return driverAssignedState;
  }

  public State getDriverUnassignedState() {
    return driverUnassignedState;
  }

  public State getCustomerCancelledState() {
    return customerCancelledState;
  }

  public State getTripEndState() {
    return tripEndState;
  }
}
