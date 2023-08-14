package com.test;

import java.io.IOException;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class MainBean {

  private static Logger logger = Logger.getGlobal();
  private int actionCount;
  private boolean closed;

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
