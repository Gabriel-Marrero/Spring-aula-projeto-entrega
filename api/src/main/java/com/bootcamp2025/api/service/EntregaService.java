package com.bootcamp2025.api.service;

import com.bootcamp2025.api.model.Entrega;
import com.bootcamp2025.api.repository.EntregaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntregaService {
    private final EntregaRepository repository;

    public EntregaService(EntregaRepository repository) {
        this.repository = repository;
    }

    public List<Entrega> listarEntregas() {
        return repository.findAll();
    }
}
