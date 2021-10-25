package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TAX")
public class TaxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tax")
    private Integer id;

    @Column(name = "tax_value", length = 5, precision = 2, nullable = false)
    private Float taxValue;

    @Column(name = "tax_name", length = 15, nullable = false)
    private String taxName;

    @Column(name = "creation_date", nullable = true)
    private Date creationDate;

    @OneToMany(mappedBy = "taxEntity")
    private List<TaxPriceProductEntity> taxPriceProductEntityList;

    /*get and set*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Float taxValue) {
        this.taxValue = taxValue;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<TaxPriceProductEntity> getTaxPriceProductEntityList() {
        return taxPriceProductEntityList;
    }

    public void setTaxPriceProductEntityList(List<TaxPriceProductEntity> taxPriceProductEntityList) {
        this.taxPriceProductEntityList = taxPriceProductEntityList;
    }

    @Override
    public String toString() {
        return "TaxEntity{" + "id=" + id + ", taxValue=" + taxValue + ", taxName=" + taxName + ", creationDate=" + creationDate + ", taxPriceProductEntityList=" + taxPriceProductEntityList + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.taxValue);
        hash = 59 * hash + Objects.hashCode(this.taxName);
        hash = 59 * hash + Objects.hashCode(this.creationDate);
        hash = 59 * hash + Objects.hashCode(this.taxPriceProductEntityList);
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
        final TaxEntity other = (TaxEntity) obj;
        if (!Objects.equals(this.taxName, other.taxName)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.taxValue, other.taxValue)) {
            return false;
        }
        if (!Objects.equals(this.creationDate, other.creationDate)) {
            return false;
        }
        if (!Objects.equals(this.taxPriceProductEntityList, other.taxPriceProductEntityList)) {
            return false;
        }
        return true;
    }

}
