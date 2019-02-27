package com.br.pan.client.services;

import com.br.pan.client.model.Customer;

import reactor.core.publisher.Mono;

public interface CustomerService {

	Mono<Customer> findByCpf(String cpf);
}
