package com.kolmikra.tests.list;

import java.util.Collection;
import java.util.List;


public interface IListOperation<E> {
    void run(List<E> list, E element);
}

