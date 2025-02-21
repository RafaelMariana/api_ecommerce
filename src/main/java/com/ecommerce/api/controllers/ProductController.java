package com.ecommerce.api.controllers;

import com.ecommerce.api.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/products")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
    ProductDTO dto = productservice.findById(id);
    return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity <List<ProductDTO>> findAll() {
        List<ProductDTO> dtoList = productservice.findAll();
        return ResponseEntity.ok(dtoList);
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO dto){
        ProductDTO productDTO = productservice.create(dto);
        return ResponseEntity.ok(productDTO);


    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO dto){
        ProductDTO productDTO = productservice.update(id, dto);
        return ResponseEntity.ok(productDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }



}
