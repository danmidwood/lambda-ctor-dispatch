package com.danmidwood.lambdactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dispatcher {

  private final Map<Integer, ConstructorInterface> ctors;

  public Dispatcher() {

    HashMap<Integer, ConstructorInterface> ctors = new HashMap<>();
    ctors.put(0, Message0::new);
    ctors.put(1, Message1::new);
    ctors.put(2, Message2::new);
    ctors.put(3, Message3::new);
    ctors.put(4, Message4::new);
    ctors.put(5, Message5::new);
    ctors.put(6, Message6::new);
    this.ctors = ctors;
  }

  public MessageType dispatch(int id, Object... args) {
    return ctors.getOrDefault(id, UnknownMessage::unknownMessage).create(args);
  }
}
