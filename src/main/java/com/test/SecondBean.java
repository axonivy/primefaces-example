package com.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SecondBean {

  public void initialize() throws InterruptedException {
    Thread.sleep(10_000);
  }
}
