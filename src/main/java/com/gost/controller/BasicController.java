package com.gost.controller;

import org.springframework.http.HttpStatus;

import java.util.List;

public interface BasicController<T> {

    List<T> getAll();

    T get(Long id);

    void remove(Long id);

    HttpStatus add(T t);

    HttpStatus edit(T t);
}
