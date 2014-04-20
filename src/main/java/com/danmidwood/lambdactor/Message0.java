package com.danmidwood.lambdactor;

public class Message0 extends MessageType {

  public Message0(Object... attributes) {
    // validate correct args
    if (attributes.length != 0) {
      throw new RuntimeException("wrong args");
    }
  }

}
