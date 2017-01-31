package com.gost.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasicService<T> {

    List<T> getAll();

    T get(Long id);

    void remove(Long id);

    T add(T t);

    T edit(T t);

}
