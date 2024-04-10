package com.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
public class RequestBean {
    private boolean requestStatus = false;

    public boolean getStatus() {
        return this.requestStatus;
    }

    public String update() {
        this.requestStatus = true;
        System.out.println("updating...");
        return redirectToIndex();
    }

    public String redirectToIndex() {
        return "index.xhtml?faces-redirect=true";
    }
}