package com.test;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.TabChangeEvent;


@ManagedBean
@ViewScoped
public class ManagerBean {

    public List<String> props;
    public List<Application> availableApplications = Arrays.asList(Application.values());
    public Application selectedApplication;
    public String selectedInfo;
    public String selectedProp;

    public ManagerBean() {
        this.selectedApplication = availableApplications.get(0);
        this.props = selectedApplication.getProps();
        reloadInfo(null);
    }

    public int getSelectedApplicationIndex() {
        return availableApplications.indexOf(selectedApplication);
    }

    public List<Application> getApplications(){
        return this.availableApplications;
    }

    public void updateSelectedApplication(TabChangeEvent<?> event) {
        setSelectedApplication(Application.valueOf(event.getTab().getTitle()));
    }

    public void setSelectedApplication(Application app) {
        this.selectedApplication = app;
        this.props = selectedApplication.getProps();
    }

    public void reloadInfo(TabChangeEvent<?> event) {
        this.selectedInfo = selectedApplication.getInfo();
    }

    public String getInfo() {
        return this.selectedInfo;
    }

    public void setProp(String prop){
        this.selectedProp = prop;
    }

    public String getProp() {
        return this.selectedInfo + ": " + this.selectedProp;
    }

    public List<String> getAllProps() {
        return props;
    }


}