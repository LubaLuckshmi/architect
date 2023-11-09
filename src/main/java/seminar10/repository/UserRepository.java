package seminar10.repository;

import java.util.List;

interface Repository<E> {
    E getById(int id);
    List<E> getAll();
    void add(E e);
    void update(E e);
    void delete(int id);
}