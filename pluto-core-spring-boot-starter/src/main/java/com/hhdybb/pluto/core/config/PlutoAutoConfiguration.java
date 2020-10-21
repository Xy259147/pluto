package com.hhdybb.pluto.core.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaohua
 * @date 2020/10/20 10:10 上午
 */
@Configuration
@EnableConfigurationProperties(PlutoProperties.class)
@ConditionalOnClass(PlutoScanPackageEntity.class)
public class PlutoAutoConfiguration {

  private static final Logger LOGGER = LoggerFactory.getLogger(PlutoAutoConfiguration.class);

  @Autowired
  PlutoProperties plutoProperties;

  @Bean
  @ConditionalOnMissingBean(PlutoScanPackageEntity.class)
  public PlutoScanPackageEntity getPhoneService(){
    if (StringUtils.isBlank(plutoProperties.getScanPackage())) {
      return new PlutoScanPackageEntity();
    }
    String[] scanPackage = plutoProperties.getScanPackage().split(",");
    for (String path : scanPackage) {
      LOGGER.info("pluto骨架正在扫描工程路径：" + path);
    }
    return new PlutoScanPackageEntity();
  }

}
