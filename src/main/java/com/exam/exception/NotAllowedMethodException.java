package com.exam.exception;

public class NotAllowedMethodException  extends Exception {
  public   NotAllowedMethodException()
    {
        super("L'acces a cette méthode n'est pas authorise");
    }
}
