package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    /*get and set*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<ProductProviderEntity> getProductProviderEntityList() {
        return productProviderEntityList;
    }

    public void setProductProviderEntityList(List<ProductProviderEntity> productProviderEntityList) {
        this.productProviderEntityList = productProviderEntityList;
    }

    @Override
    public String toString() {
        return "ProviderEntity{" + "id=" + id + ", name=" + name + ", nit=" + nit + ", url=" + url + ", address=" + address + ", phoneNumber=" + phoneNumber + ", productProviderEntityList=" + productProviderEntityList + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.nit);
        hash = 41 * hash + Objects.hashCode(this.url);
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.phoneNumber);
        hash = 41 * hash + Objects.hashCode(this.productProviderEntityList);
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
        final ProviderEntity other = (ProviderEntity) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nit, other.nit)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.productProviderEntityList, other.productProviderEntityList)) {
            return false;
        }
        return true;
    }

}
