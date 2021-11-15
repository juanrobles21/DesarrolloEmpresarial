package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TICKET")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Integer id;

    @Column(name = "paid_value", length = 13, precision = 2, nullable = true)
    private Float paidValue;

    @Column(name = "ticket_date", nullable = false)
    private Date ticketDate;

    //... The other attributes ...
    @ManyToOne
    @JoinColumn(name = "fk_id_person_customer", insertable = false, updatable = false, nullable = false)
    private PersonEntity personEntityCustomer;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_cashier", insertable = false, updatable = false, nullable = false)
    private PersonEntity personEntityCashier;

    @OneToMany(mappedBy = "ticketEntity")
    private List<TicketDetailEntity> ticketDetailEntityList;

    /*get and set*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(Float paidValue) {
        this.paidValue = paidValue;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public PersonEntity getPersonEntityCustomer() {
        return personEntityCustomer;
    }

    public void setPersonEntityCustomer(PersonEntity personEntityCustomer) {
        this.personEntityCustomer = personEntityCustomer;
    }

    public PersonEntity getPersonEntityCashier() {
        return personEntityCashier;
    }

    public void setPersonEntityCashier(PersonEntity personEntityCashier) {
        this.personEntityCashier = personEntityCashier;
    }

    public List<TicketDetailEntity> getTicketDetailEntityList() {
        return ticketDetailEntityList;
    }

    public void setTicketDetailEntityList(List<TicketDetailEntity> ticketDetailEntityList) {
        this.ticketDetailEntityList = ticketDetailEntityList;
    }

    @Override
    public String toString() {
        String customerInfo = personEntityCustomer.getName() + " " + personEntityCustomer.getLastName() + " " + personEntityCustomer.getDni();
        String cashierName = personEntityCashier.getName() + " " + personEntityCashier.getLastName();
        return "Date= " + ticketDate
                + "Cashier Info= " + cashierName
                + "Customer Info= " + customerInfo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.paidValue);
        hash = 97 * hash + Objects.hashCode(this.ticketDate);
        hash = 97 * hash + Objects.hashCode(this.personEntityCustomer);
        hash = 97 * hash + Objects.hashCode(this.personEntityCashier);
        hash = 97 * hash + Objects.hashCode(this.ticketDetailEntityList);
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
        final TicketEntity other = (TicketEntity) obj;
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        if (!Objects.equals(this.paidValue, other.paidValue))
        {
            return false;
        }
        if (!Objects.equals(this.ticketDate, other.ticketDate))
        {
            return false;
        }
        if (!Objects.equals(this.personEntityCustomer, other.personEntityCustomer))
        {
            return false;
        }
        if (!Objects.equals(this.personEntityCashier, other.personEntityCashier))
        {
            return false;
        }
        if (!Objects.equals(this.ticketDetailEntityList, other.ticketDetailEntityList))
        {
            return false;
        }
        return true;
    }

}
