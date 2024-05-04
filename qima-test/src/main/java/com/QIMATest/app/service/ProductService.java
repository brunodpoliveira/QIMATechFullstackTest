package com.QIMATest.app.service;
import com.QIMATest.app.model.Product;
import com.QIMATest.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElse(null);
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }
    public void updateProduct(Long id, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            product.setCategoryPath(updatedProduct.getCategoryPath());
            product.setAvailable(updatedProduct.isAvailable());
            productRepository.save(product);
        }
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}