package org.mteng.domain.Department;

public interface Converter<T, R> {

  R convert(T t);
}