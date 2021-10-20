package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROVIDER")
public class ProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "nit", length = 45, nullable = false)
    private String nit;

    @Column(name = "url", length = 45, nullable = true)
    private String url;

    @Column(name = "address", length = 50, nullable = false)
    private String address;

    @Column(name = "phone_number", length = 45, nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "providerEntity")
    private List<ProductProviderEntity> productProviderEntityList;
}

