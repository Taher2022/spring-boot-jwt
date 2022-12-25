package com.techgen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @GetMapping
    public ResponseEntity<String> getCustomer() {
        return ResponseEntity.ok("Get Customer");
    }

    @PostMapping("/{customer-id}")
    public ResponseEntity<String> createCustomer(@PathVariable(name = "customer-id") String customerId) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Created Customer");
    }

    @PutMapping("/{customer-id}")
    public ResponseEntity<String> updateCustomer(@PathVariable(name = "customer-id") String customerId) {
        return ResponseEntity.status(HttpStatus.OK).body("Updated Customer");
    }

    @DeleteMapping("/{customer-id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable(name = "customer-id") String customerId) {
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Customer");
    }
}
