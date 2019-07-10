package com.olesteva.state;

public interface State {

  default void handleTripRequest() {
    throw new RuntimeException("not supported ...");
  }

  default void handlePaymentRequest() {
    throw new RuntimeException("not supported ...");
  }

  default void handleDriverCancellation() {
    throw new RuntimeException("not supported ...");
  }

  default void handleCustomerCancellation() {
    throw new RuntimeException("not supported ...");
  }

  /**
   * Driver completes trip, Unassign the driver.
   */
  default void completeTrip() {
    throw new RuntimeException("not supported ...");
  }

  /**
   * After driver is unassigned, do driver & customer rating, take feedback etc.
   */
  default void endTrip() {
    throw new RuntimeException("not supported ...");
  }

  default void handleDriverEvaluation() {
    throw new RuntimeException("not supported ...");
  }

}
