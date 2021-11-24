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

    @Column(name = "fk_id_product_type")
    private Integer fkIdProductType;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_product_type", insertable = false, updatable = false, nullable = false)
    private ProductTypeEntity productTypeEntity;

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

    public Integer getFkIdProductType() {
        return fkIdProductType;
    }

    public void setFkIdProductType(Integer fkIdProductType) {
        this.fkIdProductType = fkIdProductType;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "productName=" + productName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.productName);
        hash = 67 * hash + Objects.hashCode(this.productTypeEntity);

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
        final ProductEntity other = (ProductEntity) obj;
        if (!Objects.equals(this.productName, other.productName))
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        if (!Objects.equals(this.productTypeEntity, other.productTypeEntity))
        {
            return false;
        }

        return true;
    }

}
