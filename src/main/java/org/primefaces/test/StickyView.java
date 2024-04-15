package org.primefaces.test;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("dtStickyView")
@RequestScoped
public class StickyView implements Serializable {

  private List<Product> products;
  @Inject
  private ProductService service;

  @PostConstruct
  public void init() {
    products = service.getProducts(50);
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setService(ProductService service) {
    this.service = service;
  }
}
