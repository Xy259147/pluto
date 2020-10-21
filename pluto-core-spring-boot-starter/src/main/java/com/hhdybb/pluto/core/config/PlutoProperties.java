package com.hhdybb.pluto.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liaohua
 * @date 2020/10/19 11:09 下午
 */
@ConfigurationProperties(prefix = "pluto")
public class PlutoProperties {

  private String scanPackage;

  public String getScanPackage() {
    return scanPackage;
  }

  public void setScanPackage(String scanPackage) {
    this.scanPackage = scanPackage;
  }
}
