package org.primefaces.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class SecondBean {

    public void initialize() throws InterruptedException {
        Thread.sleep(5_000);
    }
}
