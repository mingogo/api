package org.mteng.domain.Department;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentDtoConverterTest {

  private DepartmentDtoConverter converter = new DepartmentDtoConverter();
  private String code = RandomStringUtils.randomAlphabetic(5);

  @Test
  public void convert_Succeed() {
    DepartmentDto result = converter
        .convert(new Department.Builder()
            .code(code)
            .label(RandomStringUtils.randomAlphabetic(5))
            .description(RandomStringUtils.randomAlphabetic(5))
            .build());
    assertThat(result.getCode(), is(code));
  }

}