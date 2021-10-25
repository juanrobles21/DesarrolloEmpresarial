package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    @Column(name = "person_last_name", length = 45, nullable = false)
    private String personLastName;

    @Column(name = "person_phone", length = 45, nullable = true)
    private String personPhone;

    @Column(name = "person_address", length = 45, nullable = false)
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

    /*Get and setter*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonDni() {
        return personDni;
    }

    public void setPersonDni(String personDni) {
        this.personDni = personDni;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonMail() {
        return personMail;
    }

    public void setPersonMail(String personMail) {
        this.personMail = personMail;
    }

    public List<PersonPersonTypeEntity> getPersonPersonTypeEntityList() {
        return personPersonTypeEntityList;
    }

    public void setPersonPersonTypeEntityList(List<PersonPersonTypeEntity> personPersonTypeEntityList) {
        this.personPersonTypeEntityList = personPersonTypeEntityList;
    }

    public List<TicketEntity> getTicketEntityClientList() {
        return ticketEntityClientList;
    }

    public void setTicketEntityClientList(List<TicketEntity> ticketEntityClientList) {
        this.ticketEntityClientList = ticketEntityClientList;
    }

    public List<TicketEntity> getTicketEntityCashierList() {
        return ticketEntityCashierList;
    }

    public void setTicketEntityCashierList(List<TicketEntity> ticketEntityCashierList) {
        this.ticketEntityCashierList = ticketEntityCashierList;
    }

    public List<TicketDetailEntity> getTicketDetailEntityList() {
        return ticketDetailEntityList;
    }

    public void setTicketDetailEntityList(List<TicketDetailEntity> ticketDetailEntityList) {
        this.ticketDetailEntityList = ticketDetailEntityList;
    }

    @Override
    public String toString() {
        return personDni + " " + personName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.personDni);
        hash = 79 * hash + Objects.hashCode(this.personName);
        hash = 79 * hash + Objects.hashCode(this.personLastName);
        hash = 79 * hash + Objects.hashCode(this.personPhone);
        hash = 79 * hash + Objects.hashCode(this.personAddress);
        hash = 79 * hash + Objects.hashCode(this.personMail);
        hash = 79 * hash + Objects.hashCode(this.personPersonTypeEntityList);
        hash = 79 * hash + Objects.hashCode(this.ticketEntityClientList);
        hash = 79 * hash + Objects.hashCode(this.ticketEntityCashierList);
        hash = 79 * hash + Objects.hashCode(this.ticketDetailEntityList);
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
        final PersonEntity other = (PersonEntity) obj;
        if (!Objects.equals(this.personDni, other.personDni)) {
            return false;
        }
        if (!Objects.equals(this.personName, other.personName)) {
            return false;
        }
        if (!Objects.equals(this.personLastName, other.personLastName)) {
            return false;
        }
        if (!Objects.equals(this.personPhone, other.personPhone)) {
            return false;
        }
        if (!Objects.equals(this.personAddress, other.personAddress)) {
            return false;
        }
        if (!Objects.equals(this.personMail, other.personMail)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.personPersonTypeEntityList, other.personPersonTypeEntityList)) {
            return false;
        }
        if (!Objects.equals(this.ticketEntityClientList, other.ticketEntityClientList)) {
            return false;
        }
        if (!Objects.equals(this.ticketEntityCashierList, other.ticketEntityCashierList)) {
            return false;
        }
        if (!Objects.equals(this.ticketDetailEntityList, other.ticketDetailEntityList)) {
            return false;
        }
        return true;
    }

}
