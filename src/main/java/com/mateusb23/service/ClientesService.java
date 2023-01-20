package com.mateusb23.service;

import com.mateusb23.model.Cliente;
import com.mateusb23.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    public final ClientesRepository clientesRepository;
    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    ///@Autowired
    //private ClientesRepository clientesRepository;

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {

    }

}
