package org.mteng.domain.Department;

import org.springframework.stereotype.Component;

@Component
public class DepartmentDtoConverter implements Converter<Department, DepartmentDto> {

  @Override
  public DepartmentDto convert(Department department) {
    return new DepartmentDto.Builder()
        .code(department.getCode())
        .label(department.getLabel())
        .description(department.getDescription())
        .build();
  }
}