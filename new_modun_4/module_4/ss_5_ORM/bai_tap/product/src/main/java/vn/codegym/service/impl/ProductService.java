package vn.codegym.service.impl;

import vn.codegym.model.Product;
import vn.codegym.repository.IProductRepository;
import vn.codegym.repository.impl.ProductRepository;
import vn.codegym.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository=new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);

    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);

    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
