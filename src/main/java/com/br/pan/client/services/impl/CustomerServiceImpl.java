package com.br.pan.client.services.impl;

import org.springframework.stereotype.Service;

import com.br.pan.client.model.Customer;
import com.br.pan.client.repositories.CustomerRepository;
import com.br.pan.client.services.CustomerService;

import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository repository;
	
	public CustomerServiceImpl(CustomerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Mono<Customer> findByCpf(String cpf) {
		Customer findByCpf = repository.findByCpf(cpf).stream().findFirst().get();
		return Mono.justOrEmpty(findByCpf);
	}

}
