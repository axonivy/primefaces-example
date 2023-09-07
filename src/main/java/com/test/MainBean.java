package com.test;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class MainBean {

  private int actionCount;
  private boolean closed;
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void redirect() throws IOException, InterruptedException {
    Thread.sleep(10_000);
    FacesContext facesContext = FacesContext.getCurrentInstance();
    ExternalContext externalContext = facesContext.getExternalContext();
    externalContext.redirect("second.xhtml");
    closed = true;
  }

  public void doAction() {
    if (closed) {
      throw new IllegalStateException("Page already closed");
    }
    this.actionCount += 1;
  }

  public String getActionCount() {
    return Integer.toString(actionCount);
  }
}
