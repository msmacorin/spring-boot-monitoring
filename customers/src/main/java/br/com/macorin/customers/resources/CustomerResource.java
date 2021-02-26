package br.com.macorin.customers.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/customers")
public class CustomerResource {

    @GetMapping()
    public ResponseEntity<Void> getCustomer() {
        return ResponseEntity.ok().build();
    }

}