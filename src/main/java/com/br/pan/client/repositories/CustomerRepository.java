package com.br.pan.client.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.br.pan.client.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

	List<Customer> findByCpf(String cpf);
}
