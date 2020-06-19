package com.lk.service;

import com.lk.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Rượu vang",400000,15,"Nhập khẩu"));
        products.put(2,new Product(2,"Rượu nếp cái hoa vàng",100000,10,"Nhập Cao Bằng"));
        products.put(3,new Product(3,"Rượu chuối hột",150000,15,"Ngâm 2 năm"));
        products.put(4,new Product(4,"Rượu ngô",80000,20,"Mới nấu"));
        products.put(5,new Product(5,"Rượu trắng",120000,5,"Ủ 3 năm"));
        products.put(6,new Product(6,"Rượu táo mèo",100000,15,"Nhập Yên Bái"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
