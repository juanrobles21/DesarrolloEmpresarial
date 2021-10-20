package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PRICE_PRODUCT")
public class PriceProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price_product")
    private Integer id;

    @Column(name = "sale_price", length = 13, precision = 2, nullable = false)
    private Float salePrice;

    @Column(name = "shop_price", length = 13, precision = 2, nullable = false)
    private Float shopPrice;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "user_update", length = 40, nullable = false)
    private String userUpdate;

    @Column(name = "date_update", nullable = false)
    private Date dateUpdate;

    //..The other attributess....
    @ManyToOne
    @JoinColumn(name = "fk_id_product_provider", insertable = false, updatable = false ,nullable = false)
    private ProductProviderEntity productProviderEntity;

    @OneToMany(mappedBy = "priceProductEntity")
    private List<TaxPriceProductEntity> taxPriceProductEntityList;
}
