package com.olesteva.state;

import com.olesteva.state.factory.StateContext;

public class UberTrip {

  private boolean tripStarted = false;

  private StateContext stateContext;

  // CurrentState
  private State currentState;

  public UberTrip() {
    stateContext = StateContext.of(this);
  }

  public void setCurrentState(State state) {
    this.currentState = state;
  }

  public void requestTrip() {
    currentState.handleTripRequest();
  }

  public void doPayment() {
    currentState.handlePaymentRequest();
  }

  public void driverCancelled() {
    currentState.handleDriverCancellation();
  }

  public void customerCancelled() {
    currentState.handleCustomerCancellation();
  }

  public void evaluateDriver() {
    currentState.handleDriverEvaluation();
  }

  public void completeTrip() {
    currentState.completeTrip();
  }

  public boolean tripStarted(){
    return tripStarted;
  }

  public void stopTrip(){
    tripStarted = false;
  }

  public StateContext getStateContext(){
    return stateContext;
  }
}
