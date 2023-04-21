package com.thithuchanh4.service;

import java.util.List;

public interface ICRUD<E> {
    List<E> findAll();
    E findById(Long id);
    E save(E e);
    void delete(E e);
}
