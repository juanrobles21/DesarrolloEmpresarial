package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PERSON")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer id;

    @Column(name = "person_dni", length = 20, nullable = false)
    private String personDni;

    @Column(name = "person_name", length = 45, nullable = false)
    private String personName;

    @Column(name = "person_last_name", length = 45, nullable =false)
    private String personLastName;

    @Column(name = "person_phone", length = 45, nullable = true)
    private String personPhone;

    @Column(name = "person_address", length =45 , nullable = false)
    private String personAddress;

    @Column(name = "person_dni", length = 10, nullable = false)
    private String personMail;

    @OneToMany(mappedBy = "personEntity")
    private List<PersonPersonTypeEntity> personPersonTypeEntityList;

    @OneToMany(mappedBy = "personEntityClient")
    private List<TicketEntity> ticketEntityClientList;

    @OneToMany(mappedBy = "personEntityCashier")
    private List<TicketEntity> ticketEntityCashierList;

    @OneToMany(mappedBy = "personEntityAdministrator")
    private List<TicketDetailEntity> ticketDetailEntityList;
}
