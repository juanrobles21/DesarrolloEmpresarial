package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT_PROVIDER")
public class ProductProviderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_provider")
    private Integer id;

    @Column(name = "bar_code", length = 45, nullable = false)
    private String barCode;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_product", insertable = false, updatable = false, nullable = false)
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_provider", insertable = false, updatable = false, nullable = false)
    private ProviderEntity providerEntity;

    @OneToMany(mappedBy = "productProviderEntity")
    private List<PriceProductEntity> priceProductEntityList;

    /*get and set*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public ProviderEntity getProviderEntity() {
        return providerEntity;
    }

    public void setProviderEntity(ProviderEntity providerEntity) {
        this.providerEntity = providerEntity;
    }

    public List<PriceProductEntity> getPriceProductEntityList() {
        return priceProductEntityList;
    }

    public void setPriceProductEntityList(List<PriceProductEntity> priceProductEntityList) {
        this.priceProductEntityList = priceProductEntityList;
    }

    @Override
    public String toString() {
        return "ProductProviderEntity{" + "barCode=" + barCode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.barCode);
        hash = 79 * hash + Objects.hashCode(this.stock);
        hash = 79 * hash + Objects.hashCode(this.productEntity);
        hash = 79 * hash + Objects.hashCode(this.providerEntity);
        hash = 79 * hash + Objects.hashCode(this.priceProductEntityList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final ProductProviderEntity other = (ProductProviderEntity) obj;
        if (!Objects.equals(this.barCode, other.barCode))
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock))
        {
            return false;
        }
        if (!Objects.equals(this.productEntity, other.productEntity))
        {
            return false;
        }
        if (!Objects.equals(this.providerEntity, other.providerEntity))
        {
            return false;
        }
        if (!Objects.equals(this.priceProductEntityList, other.priceProductEntityList))
        {
            return false;
        }
        return true;
    }

}
