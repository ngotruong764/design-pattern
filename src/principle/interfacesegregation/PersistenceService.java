package principle.interfacesegregation;

import java.util.List;

public interface PersistenceService <T extends Entity> {
    void save(T entity);
    void delete(T entity);
    T findById(Long id);
    List<T> findByName(String name);
}
