/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.supermarket.persistence.ejb;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USUARIO
 */
@Stateless
public class ProductFacade extends Abstract<ProductEntity> {

    @PersistenceContext(unitName = "supermarketpu")
    private EntityManager _em;

    @Override
    protected EntityManager getAdmEntidad() {
        return this._em;
    }

    public ProductFacade() {
        super(ProductEntity.class);
    }

}
