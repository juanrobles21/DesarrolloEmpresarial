/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.supermarket.persistence.ejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author USUARIO
 */
public abstract class Abstract<T> {

    //Consultas generalaes 
    //T ->es el template (es como un parametro para la clase 
    private final Class<T> entidad;

    protected abstract EntityManager getAdmEntidad();

    public Abstract(Class<T> entidad) {
        this.entidad = entidad;

    }
    public void grabar(T entidad) {
        getAdmEntidad().persist(entidad);
    }

    public void borrar(T entidad) {
        getAdmEntidad().remove(entidad);
    }

    public void actualizar(T entidad) {
        getAdmEntidad().merge(entidad);
    }
    public T buscar(Object id){
       return getAdmEntidad().find(entidad, id);
    }
    public List<T> listar() {
        CriteriaBuilder cb = getAdmEntidad().getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entidad);
        cq.select(cq.from(entidad));
        List<T> allData = getAdmEntidad().createQuery(cq).getResultList();
        return allData;
    }
}
