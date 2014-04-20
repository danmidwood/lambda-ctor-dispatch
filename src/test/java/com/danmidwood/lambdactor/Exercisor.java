package com.danmidwood.lambdactor;

import org.hamcrest.Description;
import org.junit.Assert;
import org.junit.Test;


public class Exercisor {


  private MessageMatcher getMessageMatcher(Class<? extends MessageType> messageClass) {
    return messageClass::isInstance;
  }


  @Test
  public void message0() {
    MessageType message = new Dispatcher().dispatch(0);
    Assert.assertThat(message, getMessageMatcher(Message0.class));
  }

  @Test
  public void message1() {
    MessageType message = new Dispatcher().dispatch(1, "dan");
    Assert.assertThat(message, getMessageMatcher(Message1.class));
  }

  @Test
  public void message2() {
    MessageType message = new Dispatcher().dispatch(2, "dan", 10);
    Assert.assertThat(message, getMessageMatcher(Message2.class));
  }

  @Test
  public void message3() {
    MessageType message = new Dispatcher().dispatch(3, "dan", 10, true);
    Assert.assertThat(message, getMessageMatcher(Message3.class));
  }

  @Test
  public void message4() {
    MessageType message = new Dispatcher().dispatch(4, "dan", 10, true, new Object());
    Assert.assertThat(message, getMessageMatcher(Message4.class));
  }

  @Test
  public void message5() {
    MessageType message = new Dispatcher().dispatch(5, "dan", 10, true, new Object(), 123424324233242l);
    Assert.assertThat(message, getMessageMatcher(Message5.class));
  }

  @Test
  public void message6() {
    MessageType message = new Dispatcher().dispatch(6, "dan", 10, true, new Object(), 123424324233242l, 'c');
    Assert.assertThat(message, getMessageMatcher(Message6.class));
  }

  @Test
  public void unknownMessageType() {
    MessageType message = new Dispatcher().dispatch(7);
    Assert.assertThat(message, getMessageMatcher(UnknownMessage.class));
  }


  public interface MessageMatcher extends org.hamcrest.Matcher<MessageType> {
    default void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
    }

    default void describeTo(Description d) {
    }
  }


}
