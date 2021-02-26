package br.com.macorin.sales.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/api/v1/sales")
public class SalesResource {

    @GetMapping()
    public ResponseEntity<Void> getSales() {
        return ResponseEntity.ok().build();
    }
    
    
}
