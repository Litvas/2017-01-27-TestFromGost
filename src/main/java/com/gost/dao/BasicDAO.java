package com.gost.dao;

import java.util.List;

public interface BasicDAO<T> {

    List<T> getAll();

    T get(Long id);

    void remove(Long id);

    T add(T t);

    T edit(T t);

}
