package com.danmidwood.lambdactor;

@FunctionalInterface
public interface ConstructorInterface<T extends MessageType> {

  public T create(Object ... args);
}
