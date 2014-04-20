package com.danmidwood.lambdactor;

public class Message4  extends MessageType{

  public Message4(Object... attributes) {
    // validate correct args
    if (attributes.length != 4) {
      throw new RuntimeException("wrong args");
    }
  }

}
