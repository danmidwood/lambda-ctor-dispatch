package com.danmidwood.lambdactor;

public class Message2  extends MessageType{

  public Message2(Object... attributes) {
    // validate correct args
    if (attributes.length != 2) {
      throw new RuntimeException("wrong args");
    }
  }
}
