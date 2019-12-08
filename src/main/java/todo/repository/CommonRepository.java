package todo.repository;

import java.util.Collection;

public interface CommonRepository<T, K> {
  public T save(T domain);

  public Iterable<T> save(Collection<T> domains);

  public void delete(T domain);

  public T findById(K id);

  public Iterable<T> findAll();
}
