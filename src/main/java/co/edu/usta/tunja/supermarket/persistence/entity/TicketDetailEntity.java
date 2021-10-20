package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;

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
    @JoinColumn(name = "fk_id_ticket", insertable = false, updatable = false , nullable = false)
    private TicketEntity ticketEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax_price_product", insertable = false, updatable = false, nullable = false)
    private TaxPriceProductEntity taxPriceProductEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_administrator", insertable = false, updatable = false ,nullable = true)
    private PersonEntity personEntityAdministrator;


}
