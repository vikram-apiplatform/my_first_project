package io.apiplatform.v1.product.io.apiplatform.v1.product.resource;

import io.apiplatform.v1.product.io.apiplatform.v1.product.model.Product;
import io.apiplatform.v1.product.io.apiplatform.v1.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/product")
    public List<Product> getProductData(){
        return repository.findAll();
    }

    @PostMapping("/product")
    public String saveProduct(@RequestBody Product product) {
        repository.save(product);
        return "Added product data";
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(@PathVariable String id) {
        return repository.findById(id);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable String id) {
        repository.deleteById(id);
        return "product deleted with id : " + id;
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product product) {
        Optional<Product> productData = repository.findById(id);
        if (productData.isPresent()) {
            Product _product = productData.get();
            _product.setProduct_ID(Product.getProduct_ID());
            _product.setProduct_Name(Product.getProduct_Name());
            _product.setProduct_Price(Product.getProduct_Price());
            
            return new ResponseEntity<>(repository.save(_product), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
