package com.olesteva.facade;

/**
 * Facade implementation which acts like wrapper of complex subsystem {@link IServer},
 * and simplified its interface for client usage. Also creates abstraction layer which decouples
 * client from subsystem, make it flexible for future changes.
 */
public class ServerFacadeImpl implements ServerFacade {

  private final IServer server;

  public ServerFacadeImpl(IServer server) {
    this.server = server;
  }

  @Override
  public void start() {
    server.init();
    server.loadConfiguration();
    server.validate();
    server.start();
  }

  @Override
  public void stop() {
    server.closeConnection();
    server.cleanUpContext();
    server.stop();
  }
}
