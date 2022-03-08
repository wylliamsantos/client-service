package com.wvs.clientservice;

import com.wvs.clientservice.dto.ClientDTO;
import com.wvs.clientservice.entity.Client;
import com.wvs.clientservice.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    public ClientDTO saveClient(ClientDTO dto) {
        var entity = this.modelMapper.map(dto, Client.class);
        return this.modelMapper.map(this.clientRepository.save(entity), ClientDTO.class);
    }

}
