package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer id;

    @Column(name = "product_name", length = 45, nullable = false)
    private String productName;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_product_type", insertable = false, updatable = false, nullable = false)
    private ProductTypeEntity productTypeEntity;

    @OneToMany(mappedBy = "productEntity")
    private List<ProductProviderEntity> productProviderEntityList;

    /*get and set*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductTypeEntity getProductTypeEntity() {
        return productTypeEntity;
    }

    public void setProductTypeEntity(ProductTypeEntity productTypeEntity) {
        this.productTypeEntity = productTypeEntity;
    }

    public List<ProductProviderEntity> getProductProviderEntityList() {
        return productProviderEntityList;
    }

    public void setProductProviderEntityList(List<ProductProviderEntity> productProviderEntityList) {
        this.productProviderEntityList = productProviderEntityList;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "id=" + id + ", productName=" + productName + ", productTypeEntity=" + productTypeEntity + ", productProviderEntityList=" + productProviderEntityList + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.productName);
        hash = 67 * hash + Objects.hashCode(this.productTypeEntity);
        hash = 67 * hash + Objects.hashCode(this.productProviderEntityList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductEntity other = (ProductEntity) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.productTypeEntity, other.productTypeEntity)) {
            return false;
        }
        if (!Objects.equals(this.productProviderEntityList, other.productProviderEntityList)) {
            return false;
        }
        return true;
    }

}
