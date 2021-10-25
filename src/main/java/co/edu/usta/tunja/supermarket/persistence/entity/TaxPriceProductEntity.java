package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TAX_PRICE_PRODUCT")
public class TaxPriceProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tax_price_product")
    private Integer id;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_price_product", insertable = false, updatable = false, nullable = false)
    private PriceProductEntity priceProductEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax", insertable = false, updatable = false, nullable = false)
    private TaxEntity taxEntity;

    @OneToMany(mappedBy = "personEntityAdministrator")
    private List<TicketDetailEntity> ticketDetailEntityList;

    /*get and set*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PriceProductEntity getPriceProductEntity() {
        return priceProductEntity;
    }

    public void setPriceProductEntity(PriceProductEntity priceProductEntity) {
        this.priceProductEntity = priceProductEntity;
    }

    public TaxEntity getTaxEntity() {
        return taxEntity;
    }

    public void setTaxEntity(TaxEntity taxEntity) {
        this.taxEntity = taxEntity;
    }

    public List<TicketDetailEntity> getTicketDetailEntityList() {
        return ticketDetailEntityList;
    }

    public void setTicketDetailEntityList(List<TicketDetailEntity> ticketDetailEntityList) {
        this.ticketDetailEntityList = ticketDetailEntityList;
    }

    @Override
    public String toString() {
        return "TaxPriceProductEntity{" + "id=" + id + ", priceProductEntity=" + priceProductEntity + ", taxEntity=" + taxEntity + ", ticketDetailEntityList=" + ticketDetailEntityList + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.priceProductEntity);
        hash = 29 * hash + Objects.hashCode(this.taxEntity);
        hash = 29 * hash + Objects.hashCode(this.ticketDetailEntityList);
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
        final TaxPriceProductEntity other = (TaxPriceProductEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.priceProductEntity, other.priceProductEntity)) {
            return false;
        }
        if (!Objects.equals(this.taxEntity, other.taxEntity)) {
            return false;
        }
        if (!Objects.equals(this.ticketDetailEntityList, other.ticketDetailEntityList)) {
            return false;
        }
        return true;
    }

}
