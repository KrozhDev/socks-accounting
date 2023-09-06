package com.example.socksaccounting.service;

import com.example.socksaccounting.model.Operation;
import com.example.socksaccounting.model.Socks;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SocksService {
    public Socks getSocksByColorAndCottonPart(String color, Operation operation, Integer cottonPart) {
        return null;
    }

    public Socks addSocksIncome(Socks socks) {
        return null;
    }

    public Socks removeSocksOutcome(Socks socks) {
        return null;
    }
}
