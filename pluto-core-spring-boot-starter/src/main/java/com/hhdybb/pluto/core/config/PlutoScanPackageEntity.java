package com.hhdybb.pluto.core.config;

import java.util.Set;

/**
 * @author liaohua
 * @date 2020/10/20 10:28 上午
 */
public class PlutoScanPackageEntity {

  private Set<Class> classEntity;

  public Set<Class> getClassEntity() {
    return classEntity;
  }

  public void setClassEntity(Set<Class> classEntity) {
    this.classEntity = classEntity;
  }
}
