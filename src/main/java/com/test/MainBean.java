package com.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mainBean")
public class MainBean {

  private static Logger logger = Logger.getGlobal();

  private String output = "output";

  public void redirect() throws IOException {
    output += "\noutput";
    logger.log(Level.ALL, "something");
    FacesContext facesContext = FacesContext.getCurrentInstance();
    ExternalContext externalContext = facesContext.getExternalContext();
    externalContext.redirect("newPage.xhtml");
  }

  public String getName() {
    return "Main Bean";
  }

  public String getOutput() {
    return output;
  }
}
