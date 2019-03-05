package com.olesteva.facade;

/**
 * Subsystem interface, representing number of different modules, that needs to be
 * invoked by client to do basically two steps: start server and stop server.
 */
public interface IServer {

  /**
   * Sub-steps for starting the server
   */
  void init();
  void loadConfiguration();
  void validate();
  void start();

  /**
   * Sub-steps for stopping the server
   */
  void closeConnection();
  void cleanUpContext();
  void stop();
}
