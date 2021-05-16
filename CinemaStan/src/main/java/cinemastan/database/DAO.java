
package cinemastan.database;

public interface DAO<T, K> {
    void create(T object) throws Exception;
  
}
