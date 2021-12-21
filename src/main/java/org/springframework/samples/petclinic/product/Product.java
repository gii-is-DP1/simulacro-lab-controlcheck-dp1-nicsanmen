package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends NamedEntity{
//    @Id
//	Integer id;
    
    @NotNull
    @Min(value = 3)
    @Max(value = 50)
    String name;
    
    @NotNull
    @PositiveOrZero
    double price;
    
    ProductType productType;
}
