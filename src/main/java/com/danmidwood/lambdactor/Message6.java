package com.danmidwood.lambdactor;

public class Message6 extends MessageType {

  public Message6(Object... attributes) {
    // validate correct args
    if (attributes.length != 6) {
      throw new RuntimeException("wrong args");
    }
  }
}
