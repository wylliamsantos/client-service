package com.wvs.clientservice.service;

import com.wvs.clientservice.dto.ClientDTO;
import com.wvs.clientservice.entity.Client;
import com.wvs.clientservice.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.Cacheable;
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

    @Cacheable(value = "clientCache")
    public ClientDTO findClient(Long id) {
        var entity = clientRepository.findById(id);
        var client = entity.orElseThrow(() -> new IllegalArgumentException(StringUtils.join("Not found client for this id=", id)));
        return this.modelMapper.map(client, ClientDTO.class);
    }

}
