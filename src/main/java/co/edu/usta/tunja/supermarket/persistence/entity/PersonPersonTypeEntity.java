package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERSON_PERSON_TYPE")
public class PersonPersonTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person_person_type")
    private Integer id;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_person", insertable = false, updatable = false ,nullable = false)
    private PersonEntity personEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_person_type", insertable = false, updatable = false, nullable = false)
    private PersonTypeEntity personTypeEntity;
}
