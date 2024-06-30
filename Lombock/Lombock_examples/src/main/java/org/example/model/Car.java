package org.example.model;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Builder

public class Car {
    private String brand;
    private String model;


    ///Custom builder for brand///
    public Car buildBrand(String brand) {
        this.brand = brand;
        return this;
    }

    ///Custom builder for model///
    public Car buildModel(String model) {
        this.model = model;
        return this;
    }

    /* Custom builder, it returns Object that has parameters value is null by default */
    public Car build() {
        return new Car();
    }
    /// The information about returns object ///
    public String info() {
        return this.brand+" "+this.model;
    }


}
