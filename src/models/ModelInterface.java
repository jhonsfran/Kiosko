/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.util.List;


/**
 *
 * @author Univalle_F
 */
public interface ModelInterface {
    
    <T> T getByIDString(final Class<T> type, String id);
    <T> T getByIDInt(final Class<T> type, int id);
 
    <T> List<T> listar(Class<T> type);
    
    List executeQuery(String query);
 
    <T> String insertIdString(T entity);
    
    <T> int insertIdInt(T entity);
    public <T> void insert (T entity);
 
    <T> void update(T entity);
 
    <T> void delete(T entity);
 
    <T> void deleteByIdString(final Class<T> type, String id);
        
}
