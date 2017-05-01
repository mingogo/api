package org.mteng.rest;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.mteng.domain.Department.DepartmentDto;
import org.mteng.domain.Department.DepartmentDtoConverter;
import org.mteng.domain.Department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/api/v1")
public class DepartmentResource {

  private DepartmentService service;
  private DepartmentDtoConverter converter;

  @Autowired
  public DepartmentResource(DepartmentService service,
      DepartmentDtoConverter converter) {
    this.service = service;
    this.converter = converter;
  }

  @GET
  @Path("/departments")
  @Produces("application/json")
  public List<DepartmentDto> getDepartments() {
    return Lists.newArrayList(service.getAll())
        .stream()
        .map(d -> converter.convert(d))
        .collect(Collectors.toList());
  }

}