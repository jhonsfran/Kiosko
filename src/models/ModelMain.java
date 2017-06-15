/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import conf.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;


public class ModelMain<T> implements ModelInterface{
    
    private Session sesion; 
    private Transaction tx;  

    @Override
    public <T> int insertIdInt(T entity) throws HibernateException 
    {
        
        int id = 0;
        
        try 
        { 
            iniciaOperacion();
            id = (int) sesion.save(entity); 
            tx.commit(); 
            
        } catch (HibernateException he) 
        { 
            ExcepcionManager(he); 
            throw he; 
            
        } finally 
        { 
            sesion.close(); 
        }  

        return id;
    }  
    
    @Override
    public <T> void insert(T entity) throws HibernateException {

        try {
            iniciaOperacion();
            sesion.save(entity);
            tx.commit();

        } catch (HibernateException he) {
            ExcepcionManager(he);
            throw he;

        } finally {
            sesion.close();
        }
        
    }
    
    @Override
    public <T> String insertIdString(T entity) throws HibernateException 
    {
        
        String id = "";
        
        try 
        { 
            iniciaOperacion();
            id = (String) sesion.save(entity); 
            tx.commit(); 
            
        } catch (HibernateException he) 
        { 
            ExcepcionManager(he); 
            throw he; 
            
        } finally 
        { 
            sesion.close(); 
        }  

        return id;
    }

    @Override
    public <T> void update(T entity) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.update(entity); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            ExcepcionManager(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    } 
    
    @Override
    public <T> T getByIDString(final Class<T> type, String id) throws HibernateException 
    { 
        T miobjeto = null;  
        
        try 
        { 
            iniciaOperacion(); 
            miobjeto = (T) sesion.get(type, id);
            
        } catch (HibernateException he) 
        { 
            ExcepcionManager(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

        return miobjeto; 
    }  
    
    @Override
    public <T> T getByIDInt(final Class<T> type, int id) throws HibernateException {
        T miobjeto = null;

        try {
            iniciaOperacion();
            miobjeto = (T) sesion.get(type, id);

        } catch (HibernateException he) {
            ExcepcionManager(he);
            throw he;
        } finally {
            sesion.close();
        }

        return miobjeto;
    }
    
    @Override
    public <T> void deleteByIdString(final Class<T> type, String id) throws HibernateException 
    { 

        try 
        { 
            iniciaOperacion(); 
            sesion.delete(getByIDString(type,id));
            
        } catch (HibernateException he) 
        { 
            ExcepcionManager(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

    }
    
    @Override
    public <T> void delete(T entity) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.delete(entity); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            ExcepcionManager(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    @Override
    public <T> List<T> listar(final Class<T> type) throws HibernateException 
    { 
        List<T> lista = null;  

        try 
        { 
            
            iniciaOperacion();             
            lista = this.sesion.createQuery("FROM " + type.getName()).list();
            
        } catch (HibernateException he) {
            
            ExcepcionManager(he);
            throw he;
            
        } finally 
        { 
            sesion.close(); 
        }  

        return lista; 
    }  
    
    @Override
    public List executeQuery(String query) throws HibernateException {
        
        List data = null;

        try {

            iniciaOperacion();
            
            //JOptionPane.showMessageDialog(null, "No se encuentra ningún pedido con ese id" + query);
            
            SQLQuery jquery = sesion.createSQLQuery(query);
            jquery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            data = jquery.list();
            
            //lista = this.sesion.createSQLQuery(query).setString(0, "Pus%").list();
            
            //JOptionPane.showMessageDialog(null, "No se encuentra ningún pedido con ese id" + data);

        } catch (HibernateException he) {

            ExcepcionManager(he);
            throw he;

        } finally {
            sesion.close();
        }

        return data;
    }
    

    private void iniciaOperacion() throws HibernateException 
    { 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  


    private void ExcepcionManager(HibernateException he) throws HibernateException 
    { 
        //cancelar la transacción
        tx.rollback(); 
        
        if(he.getCause() != null){
            
            System.out.println(he.getCause());
            JOptionPane.showMessageDialog(null,he.getCause().getMessage());
            
        }else{
            
            System.out.println(he);
            JOptionPane.showMessageDialog(null,he);
        }
        
        //throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 

    } 
    
}