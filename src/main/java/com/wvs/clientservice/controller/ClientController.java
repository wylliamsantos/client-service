package com.wvs.clientservice.controller;

import com.wvs.clientservice.service.ClientService;
import com.wvs.clientservice.dto.ClientDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(path="/v1/client", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class ClientController {

    @Autowired
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDTO> saveClient(@RequestBody @Valid ClientDTO client) {
        return ResponseEntity.ok(this.clientService.saveClient(client));
    }

    @GetMapping(path = "/{id}", consumes = {MediaType.ALL_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ClientDTO> findClient(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.clientService.findClient(id));
    }

}
