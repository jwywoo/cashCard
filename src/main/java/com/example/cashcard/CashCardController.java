package com.example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation this class is Controller to handle request
@RestController
// Annotation indicating which address requests must have to access this controller
@RequestMapping("/cashcards")
public class CashCardController {
    // Annotation that shows this is handling GET
    @GetMapping("/{requestId}")
    public ResponseEntity<String> findById() {
        return ResponseEntity.ok("{}");
    }
}
