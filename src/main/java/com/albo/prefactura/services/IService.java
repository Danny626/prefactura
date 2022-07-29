package com.albo.prefactura.services;

import java.util.List;
import java.util.Optional;

public interface IService<T, V> {
    List<T> findAll();
    Optional<T> findById(V id);
    T saveOrUpdate(T t);
    Boolean deleteById(V id);
}
