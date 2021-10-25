package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PRICE_PRODUCT")
public class PriceProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price_product")
    private Integer id;

    @Column(name = "sale_price", length = 13, precision = 2, nullable = false)
    private Float salePrice;

    @Column(name = "shop_price", length = 13, precision = 2, nullable = false)
    private Float shopPrice;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "user_update", length = 40, nullable = false)
    private String userUpdate;

    @Column(name = "date_update", nullable = false)
    private Date dateUpdate;

    //..The other attributess....
    @ManyToOne
    @JoinColumn(name = "fk_id_product_provider", insertable = false, updatable = false, nullable = false)
    private ProductProviderEntity productProviderEntity;

    @OneToMany(mappedBy = "priceProductEntity")
    private List<TaxPriceProductEntity> taxPriceProductEntityList;

    /*get and set*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Float shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public ProductProviderEntity getProductProviderEntity() {
        return productProviderEntity;
    }

    public void setProductProviderEntity(ProductProviderEntity productProviderEntity) {
        this.productProviderEntity = productProviderEntity;
    }

    public List<TaxPriceProductEntity> getTaxPriceProductEntityList() {
        return taxPriceProductEntityList;
    }

    public void setTaxPriceProductEntityList(List<TaxPriceProductEntity> taxPriceProductEntityList) {
        this.taxPriceProductEntityList = taxPriceProductEntityList;
    }

    @Override
    public String toString() {
        return "PriceProductEntity{" + "id=" + id + ", salePrice=" + salePrice + ", shopPrice=" + shopPrice + ", startDate=" + startDate + ", userUpdate=" + userUpdate + ", dateUpdate=" + dateUpdate + ", productProviderEntity=" + productProviderEntity + ", taxPriceProductEntityList=" + taxPriceProductEntityList + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.salePrice);
        hash = 67 * hash + Objects.hashCode(this.shopPrice);
        hash = 67 * hash + Objects.hashCode(this.startDate);
        hash = 67 * hash + Objects.hashCode(this.userUpdate);
        hash = 67 * hash + Objects.hashCode(this.dateUpdate);
        hash = 67 * hash + Objects.hashCode(this.productProviderEntity);
        hash = 67 * hash + Objects.hashCode(this.taxPriceProductEntityList);
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
        final PriceProductEntity other = (PriceProductEntity) obj;
        if (!Objects.equals(this.userUpdate, other.userUpdate)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.salePrice, other.salePrice)) {
            return false;
        }
        if (!Objects.equals(this.shopPrice, other.shopPrice)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        if (!Objects.equals(this.dateUpdate, other.dateUpdate)) {
            return false;
        }
        if (!Objects.equals(this.productProviderEntity, other.productProviderEntity)) {
            return false;
        }
        if (!Objects.equals(this.taxPriceProductEntityList, other.taxPriceProductEntityList)) {
            return false;
        }
        return true;
    }

}
