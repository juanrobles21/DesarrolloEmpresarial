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

    @Column(name = "devolution_request", nullable = true)
    private Date devolutionRequest;

    @Column(name = "devolution_approved", nullable = true)
    private Date devolutionApproved;

    @Column(name = "fk_id_ticket")
    private Integer fkIdTicket;

    @Column(name = "fk_id_tax_price_product")
    private Integer fkIdTaxPriceProduct;

    @Column(name = "fk_id_person_administrator")
    private Integer fkIdPersonAdministrator;

    @Column(name = "description_devolution", length = 45, nullable = true)
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

    public Integer getFkIdTicket() {
        return fkIdTicket;
    }

    public void setFkIdTicket(Integer fkIdTicket) {
        this.fkIdTicket = fkIdTicket;
    }

    public Integer getFkIdTaxPriceProduct() {
        return fkIdTaxPriceProduct;
    }

    public void setFkIdTaxPriceProduct(Integer fkIdTaxPriceProduct) {
        this.fkIdTaxPriceProduct = fkIdTaxPriceProduct;
    }

    public Integer getFkIdPersonAdministrator() {
        return fkIdPersonAdministrator;
    }

    public void setFkIdPersonAdministrator(Integer fkIdPersonAdministrator) {
        this.fkIdPersonAdministrator = fkIdPersonAdministrator;
    }

    @Override
    public String toString() {
        String productName = taxPriceProductEntity.getPriceProductEntity().getProductProviderEntity().getProductEntity().getProductName();
        Float price = taxPriceProductEntity.getPriceProductEntity().getSalePrice();
        Float taxValue = taxPriceProductEntity.getTaxEntity().getTaxValue();
        Float total = amount * (price * (1 + taxValue));
        return "" + total;
        /*return "Nombre del producrto: " + productName
                + "Cantidad: " + amount
                + "Precio: " + price
                + "Inpuesto: " + taxValue
                + "Total: " + total;
         */
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.amount);
        hash = 47 * hash + Objects.hashCode(this.devolutionRequest);
        hash = 47 * hash + Objects.hashCode(this.devolutionApproved);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.ticketEntity);
        hash = 47 * hash + Objects.hashCode(this.taxPriceProductEntity);
        hash = 47 * hash + Objects.hashCode(this.personEntityAdministrator);
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
        final TicketDetailEntity other = (TicketDetailEntity) obj;
        if (!Objects.equals(this.description, other.description))
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount))
        {
            return false;
        }
        if (!Objects.equals(this.devolutionRequest, other.devolutionRequest))
        {
            return false;
        }
        if (!Objects.equals(this.devolutionApproved, other.devolutionApproved))
        {
            return false;
        }
        if (!Objects.equals(this.ticketEntity, other.ticketEntity))
        {
            return false;
        }
        if (!Objects.equals(this.taxPriceProductEntity, other.taxPriceProductEntity))
        {
            return false;
        }
        if (!Objects.equals(this.personEntityAdministrator, other.personEntityAdministrator))
        {
            return false;
        }
        return true;
    }

}
