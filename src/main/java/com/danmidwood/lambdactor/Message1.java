package com.danmidwood.lambdactor;

public class Message1 extends MessageType {


  public Message1(Object... attributes) {
    // validate correct args
    if (attributes.length != 1) {
      throw new RuntimeException("wrong args");
    }
  }

}
