package io.apiplatform.v1.product.io.apiplatform.v1.product.repository;

import io.apiplatform.v1.product.io.apiplatform.v1.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
