package com.javaschedule.service.infrastructure.convert;

import org.springframework.stereotype.Component;

@Component
public interface Mapper<T, E> {
	E modelToDto(T model);
	T dtoToModel(E dto);
}
