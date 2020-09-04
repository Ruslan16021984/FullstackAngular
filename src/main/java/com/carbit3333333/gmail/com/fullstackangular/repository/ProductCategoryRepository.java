package com.carbit3333333.gmail.com.fullstackangular.repository;

import com.carbit3333333.gmail.com.fullstackangular.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product_category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
