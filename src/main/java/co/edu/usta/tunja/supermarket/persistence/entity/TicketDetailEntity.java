package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TICKET_DETAIL")
public class TicketDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket_detail")
    private Integer id;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "unit_value", length = 13, precision = 2, nullable = false)
    private Float unitValue;

    @Column(name = "address", length = 45, nullable = false)
    private String address;

    @Column(name = "devolution_request", nullable = true)
    private Date devolutionRequest;

    @Column(name = "devolution_approved", nullable = true)
    private Date devolutionApproved;

    @Column(name = "description", length = 45, nullable = true)
    private String description;

    @ManyToOne
    @JoinColumn(name = "fk_id_ticket", insertable = false, updatable = false, nullable = false)
    private TicketEntity ticketEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax_price_product", insertable = false, updatable = false, nullable = false)
    private TaxPriceProductEntity taxPriceProductEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_administrator", insertable = false, updatable = false, nullable = true)
    private PersonEntity personEntityAdministrator;

    /*Get and set*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Float unitValue) {
        this.unitValue = unitValue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDevolutionRequest() {
        return devolutionRequest;
    }

    public void setDevolutionRequest(Date devolutionRequest) {
        this.devolutionRequest = devolutionRequest;
    }

    public Date getDevolutionApproved() {
        return devolutionApproved;
    }

    public void setDevolutionApproved(Date devolutionApproved) {
        this.devolutionApproved = devolutionApproved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketEntity getTicketEntity() {
        return ticketEntity;
    }

    public void setTicketEntity(TicketEntity ticketEntity) {
        this.ticketEntity = ticketEntity;
    }

    public TaxPriceProductEntity getTaxPriceProductEntity() {
        return taxPriceProductEntity;
    }

    public void setTaxPriceProductEntity(TaxPriceProductEntity taxPriceProductEntity) {
        this.taxPriceProductEntity = taxPriceProductEntity;
    }

    public PersonEntity getPersonEntityAdministrator() {
        return personEntityAdministrator;
    }

    public void setPersonEntityAdministrator(PersonEntity personEntityAdministrator) {
        this.personEntityAdministrator = personEntityAdministrator;
    }

    @Override
    public String toString() {
        return "TicketDetailEntity{" + "id=" + id + ", amount=" + amount + ", unitValue=" + unitValue + ", address=" + address + ", devolutionRequest=" + devolutionRequest + ", devolutionApproved=" + devolutionApproved + ", description=" + description + ", ticketEntity=" + ticketEntity + ", taxPriceProductEntity=" + taxPriceProductEntity.getPriceProductEntity().getProductProviderEntity().getPriceProductEntityList() + ", personEntityAdministrator=" + personEntityAdministrator + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.amount);
        hash = 71 * hash + Objects.hashCode(this.unitValue);
        hash = 71 * hash + Objects.hashCode(this.address);
        hash = 71 * hash + Objects.hashCode(this.devolutionRequest);
        hash = 71 * hash + Objects.hashCode(this.devolutionApproved);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.ticketEntity);
        hash = 71 * hash + Objects.hashCode(this.taxPriceProductEntity);
        hash = 71 * hash + Objects.hashCode(this.personEntityAdministrator);
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
        final TicketDetailEntity other = (TicketDetailEntity) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        if (!Objects.equals(this.unitValue, other.unitValue)) {
            return false;
        }
        if (!Objects.equals(this.devolutionRequest, other.devolutionRequest)) {
            return false;
        }
        if (!Objects.equals(this.devolutionApproved, other.devolutionApproved)) {
            return false;
        }
        if (!Objects.equals(this.ticketEntity, other.ticketEntity)) {
            return false;
        }
        if (!Objects.equals(this.taxPriceProductEntity, other.taxPriceProductEntity)) {
            return false;
        }
        if (!Objects.equals(this.personEntityAdministrator, other.personEntityAdministrator)) {
            return false;
        }
        return true;
    }

}
