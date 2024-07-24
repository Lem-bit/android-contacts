package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface<T> {

    boolean theSameAs(T obj);

    boolean equals(Object object);
}
