package com.example.restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
@Setter
@Getter

@Entity(name = "tables")

public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Chairs_number")
    private int chairs;

    @Column(name = "Zone")
    private String zone;

    @Column(name = "Type")
    private String type;

    public Table() {
    }
}
