package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
}
