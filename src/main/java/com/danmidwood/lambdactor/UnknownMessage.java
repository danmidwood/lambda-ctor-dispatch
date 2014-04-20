package com.danmidwood.lambdactor;

public class UnknownMessage extends MessageType {

  private static UnknownMessage unknownMessage = new UnknownMessage();

  private UnknownMessage() {
  }

  public static MessageType unknownMessage(Object ... args) {
    return unknownMessage;
  }
}
