package com.danmidwood.lambdactor;

public class Message3  extends MessageType{

  public Message3(Object... attributes) {
    // validate correct args
    if (attributes.length != 3) {
      throw new RuntimeException("wrong args");
    }
  }
}
