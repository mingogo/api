package org.mteng.domain.Department;

public class DepartmentDto {

  private String code;
  private String label;
  private String description;

  public DepartmentDto(Builder builder) {
    this.code = builder.code;
    this.label = builder.label;
    this.description = builder.description;
  }

  public String getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

  public String getDescription() {
    return description;
  }

  public static class Builder {

    private String code;
    private String label;
    private String description;

    public Builder code(String code) {
      this.code = code;
      return this;
    }

    public Builder label(String label) {
      this.label = label;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public DepartmentDto build() {
      return new DepartmentDto(this);
    }
  }
}
