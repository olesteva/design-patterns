package com.olesteva.facade;

public class Server implements IServer{

  @Override
  public void init() {
    System.out.println("Server initialization...");
  }

  @Override
  public void loadConfiguration() {
    System.out.println("Server loads configuration ...");
  }

  @Override
  public void validate() {
    System.out.println("Server validates ...");
  }

  @Override
  public void start() {
    System.out.println("Server started ...");
  }

  @Override
  public void closeConnection() {
    System.out.println("Server closes connection ...");
  }

  @Override
  public void cleanUpContext() {
    System.out.println("Server clean up context ...");
  }

  @Override
  public void stop() {
    System.out.println("Server stopper ...");
  }
}
