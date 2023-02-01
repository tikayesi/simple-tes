package com.enigma.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mst_product")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "product_id")
    private String id;
    private String name;
    @Column(name = "product_price")
    private Integer productPrice;
    private Integer stock;
}
