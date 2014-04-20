package com.danmidwood.lambdactor;

public class Message5 extends MessageType {

  public Message5(Object... attributes) {
    // validate correct args
    if (attributes.length != 5) {
      throw new RuntimeException("wrong args");
    }
  }
}
