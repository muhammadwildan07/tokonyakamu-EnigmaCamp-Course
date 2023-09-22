package com.enigma.camp.tokonyakamu.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_store")
public class Store {

    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "no_siup", nullable = false, unique = true, length = 100)
    private String noSiup;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "addres", nullable = false)
    private String addres;

    @Column(name = "mobile_phone", nullable = false, unique = true)
    private String mobilePhone;


}
