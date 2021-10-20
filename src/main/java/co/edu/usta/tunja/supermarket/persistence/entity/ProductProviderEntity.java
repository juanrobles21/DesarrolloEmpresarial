package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT_PROVIDER")
public class ProductProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_provider")
    private Integer id;

    @Column(name = "bar_code", length = 45, nullable = false)
    private String barCode;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    //... The other attributes...
    @ManyToOne
    @JoinColumn(name = "fk_id_product", insertable = false, updatable = false, nullable = false)
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "fk_id_provider", insertable = false, updatable = false, nullable = false)
    private ProviderEntity providerEntity;

    @OneToMany(mappedBy = "productProviderEntity")
    private List<PriceProductEntity> priceProductEntityList;


}
