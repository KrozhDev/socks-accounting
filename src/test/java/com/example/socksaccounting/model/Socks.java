package com.example.socksaccounting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
public class Socks {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String color;
    @Min(1)
    @Max(100)
    private Integer cottonPart;
    @Min(1)
    private Integer quantity;
}
