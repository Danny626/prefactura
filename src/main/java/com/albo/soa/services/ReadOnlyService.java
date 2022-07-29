package com.albo.soa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

//public interface ReadOnlyService<T, ID> extends Repository<T, ID> {
public interface ReadOnlyService<T, ID> {

	List<T> findAll();

	List<T> findAll(Sort sort);

	Page<T> findAll(Pageable pageable);

	Optional<T> findById(ID id);

	long count();

}
