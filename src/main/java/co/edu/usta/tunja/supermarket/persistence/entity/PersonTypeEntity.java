package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

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
}
