package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
	
	private ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
    public List<Product> getAllProducts(){
        return null;
    }

    public List<Product> getProductsCheaperThan(double price) {
        return null;
    }

    public ProductType getProductType(String typeName) {
//    	return productRepository.findAllProductTypes();
    	return null;
    }

    public Product save(Product p){
        return null;       
    }

    
}
