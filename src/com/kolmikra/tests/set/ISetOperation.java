package com.kolmikra.tests.set;

import java.util.List;
import java.util.Set;

public interface ISetOperation<E> {
    void run(Set<E> set, E element);
}
