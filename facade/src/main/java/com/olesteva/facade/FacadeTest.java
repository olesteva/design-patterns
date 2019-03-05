package com.olesteva.facade;

public class FacadeTest {

  public static void main(String[] args) {

    IServer server = new Server();
    ServerFacade serverFacade = new ServerFacadeImpl(server);
    testFacade(serverFacade);

  }

  /**
   * Fake client
   */
  static void testFacade(ServerFacade serverFacade) {
    serverFacade.start();
    serverFacade.stop();
  }
}
