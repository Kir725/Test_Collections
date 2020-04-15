package com.kolmikra.tests.set;

import java.util.List;
import java.util.Set;

public interface SetOperation <E> {
    void run(Set<E> set, E element);
}
