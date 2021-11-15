package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PERSON_TYPE")
public class PersonTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person_type")
    private Integer id;

    @Column(name = "person_type_name", length = 45, nullable = false)
    private String personTypeName;

    @OneToMany(mappedBy = "personTypeEntity")
    private List<PersonPersonTypeEntity> personPersonTypeEntityList;

    /*get and set */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonTypeName() {
        return personTypeName;
    }

    public void setPersonTypeName(String personTypeName) {
        this.personTypeName = personTypeName;
    }

    public List<PersonPersonTypeEntity> getPersonPersonTypeEntityList() {
        return personPersonTypeEntityList;
    }

    public void setPersonPersonTypeEntityList(List<PersonPersonTypeEntity> personPersonTypeEntityList) {
        this.personPersonTypeEntityList = personPersonTypeEntityList;
    }

    @Override
    public String toString() {
        return personTypeName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.personTypeName);
        hash = 67 * hash + Objects.hashCode(this.personPersonTypeEntityList);
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
        final PersonTypeEntity other = (PersonTypeEntity) obj;
        if (!Objects.equals(this.personTypeName, other.personTypeName))
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        if (!Objects.equals(this.personPersonTypeEntityList, other.personPersonTypeEntityList))
        {
            return false;
        }
        return true;
    }
    

}
