//package com.bnpp.galaxy.exception;
//
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//
//public class MyExceptionTest {
//
//    @Test(expected = MyException.class)
//    public void should_raise_an_exception() throws MyException {
//        throw new MyException();
//    }
//
//
//    @Test(expected = MyException.class)
//    public void should_be_an_exception() throws MyException {
//        throw new MyException(ErrorCode.TE001);
//    }
//
//
//    @Test
//    public void given_message_should_be_transmitted() {
//        MyException exception = new MyException(ErrorCode.TE001);
//
//        Assertions.assertThat(exception.getMessage()).isEqualTo("One result expected and many returned");
//    }
//
//
//    @Test
//    public void given_exception_should_be_transmitted() {
//        Throwable cause = new IllegalArgumentException("wrong number");
//        MyException exception = new MyException(cause);
//
//        Assertions.assertThat(exception.getCause()).isEqualTo(cause);
//    }
//
//
//    @Test
//    public void given_message_and_exception_should_be_transmitted() {
//        Throwable cause = new IllegalArgumentException("wrong number");
//        MyException exception = new MyException(ErrorCode.TE001, cause);
//
//        Assertions.assertThat(exception.getMessage()).isEqualTo("One result expected and many returned");
//        Assertions.assertThat(exception.getCause()).isEqualTo(cause);
//    }
//
//}