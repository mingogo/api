package org.mteng.rest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.mteng.rest.DepartmentResource;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(DepartmentResource.class);
  }

}
