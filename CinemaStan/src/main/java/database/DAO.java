
package database;

public interface DAO<T, K> {
    void create(T object) throws Exception;
  
}
