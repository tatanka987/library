package ua.sourceit.dataaccess.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<K extends Serializable, T> 
{
    public T find(K id) throws SQLException;
    public List<T> find() throws SQLException;
    public K save(T value);
    public void update(T value);
    public void delete(T value);
}