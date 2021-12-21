package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductType extends BaseEntity	{
    
//	@Id
//	Integer id;
    
	@NotNull
	@Min(value = 3)
	@Max(value = 50)
	String name;


}
