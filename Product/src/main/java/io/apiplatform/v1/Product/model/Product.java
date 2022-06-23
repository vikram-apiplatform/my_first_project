package io.apiplatform.v1.product.io.apiplatform.v1.product.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "product")
public class Product {

    @Id
    private String id;
    private Integer Product_ID;
    private String Product_Name;
    private String Product_Price;
    
    public Integer getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(Integer Product_ID) {
        this.Product_ID = Product_ID;
    }
    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }
    public String getProduct_Price() {
        return Product_Price;
    }

    public void setProduct_Price(String Product_Price) {
        this.Product_Price = Product_Price;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
