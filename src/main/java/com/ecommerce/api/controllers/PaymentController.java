package com.ecommerce.api.controllers;


import com.ecommerce.api.dto.PaymentDTO;
import com.ecommerce.api.dto.PaymentsByDateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/payments")
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/buscar")
    public List<PaymentDTO> findByDate(@RequestBody PaymentsByDateDTO dto) {
        return paymentService.findByDate(dto);

    }
    @GetMapping("/{id}")
    public PaymentDTO findById(@RequestBody PaymentDTO dto) {
        return paymentService.findById(dto);
    }


}
