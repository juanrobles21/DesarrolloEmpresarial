package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TAX_PRICE_PRODUCT")
public class TaxPriceProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tax_price_product")
    private Integer id;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_price_product", insertable = false, updatable = false , nullable = false)
    private PriceProductEntity priceProductEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax", insertable = false, updatable = false , nullable = false)
    private TaxEntity taxEntity;

    @OneToMany(mappedBy = "personEntityAdministrator")
    private List<TicketDetailEntity> ticketDetailEntityList;

}
