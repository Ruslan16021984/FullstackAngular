package com.carbit3333333.gmail.com.fullstackangular.config;

import com.carbit3333333.gmail.com.fullstackangular.entity.Product;
import com.carbit3333333.gmail.com.fullstackangular.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod[] theUnSupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
        //disable HTTP methods for Product: PUT, POST, DELETE
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnSupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnSupportedActions));
        //disable HTTP methods for ProductCategory: PUT, POST, DELETE
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnSupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnSupportedActions));

    }
}
