package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TAX")
public class TaxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tax")
    private Integer id;

    @Column(name = "tax_value", length = 5, precision = 2, nullable = false)
    private Float taxValue;

    @Column(name = "tax_name", length = 15, nullable = false)
    private String taxName;

    @Column(name = "creation_date", nullable = true)
    private Date creationDate;

    @OneToMany(mappedBy = "taxEntity")
    private List<TaxPriceProductEntity> taxPriceProductEntityList;
}
