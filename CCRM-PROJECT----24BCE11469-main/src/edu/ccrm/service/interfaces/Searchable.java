package edu.ccrm.service.interfaces;

import java.util.List;

public interface Searchable<T> {
    List<T> search(String keyword);
}
