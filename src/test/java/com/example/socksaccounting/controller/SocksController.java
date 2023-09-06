package com.example.socksaccounting.controller;


import com.example.socksaccounting.model.Operation;
import com.example.socksaccounting.model.Socks;
import com.example.socksaccounting.service.SocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SocksController {





    private final SocksService socksService;

    @Autowired
    public SocksController(SocksService socksService) {
        this.socksService = socksService;
    }

    @GetMapping("/socks")
    public ResponseEntity<Socks> getSocksByColorAndCottonPart(@RequestParam String color,
                                          @RequestParam Operation operation,
                                          @RequestParam Integer cottonPart) {

        if (color == null || operation == null || cottonPart < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } else {
            Socks socks = socksService.getSocksByColorAndCottonPart(color, operation, cottonPart);
            if (socks != null) {
                return ResponseEntity.ok(socks);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/socks/income")
    public Socks addSocksIncome(@RequestBody Socks socks) {
        return socksService.addSocksIncome(socks);
    }

    @PostMapping("/socks/outcome")
    public Socks removeSocksOutcome(@RequestBody Socks socks) {
        return socksService.removeSocksOutcome(socks);
    }






}
