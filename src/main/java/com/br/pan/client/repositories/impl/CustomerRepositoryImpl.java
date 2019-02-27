//package com.br.pan.client.repositories.impl;
//
//import org.jdbi.v3.core.Jdbi;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//import com.br.pan.client.model.Customer;
//import com.br.pan.client.repositories.CustomerRepository;
//
//import reactor.core.publisher.Mono;
//
//@Configuration
//public class CustomerRepositoryImpl implements CustomerRepository {
//
//	@Autowired
//	private Jdbi jdbi;
////	@Autowired
////	private Scheduler jdbcScheduler;
//	
////	@Autowired
////	public CustomerRepositoryImpl(Jdbi jdbi, Scheduler jdbcScheduler) {
////		this.jdbi = jdbi;
////		this.jdbcScheduler = jdbcScheduler;
////	}
//
//	@Override
//	public Mono<Customer> findByCpf(String cpf) {
////		return async(() -> this.jdbi.withHandle(handle ->
////        handle.createQuery(FIND_CUSTOMER)
////                .bind("cpf", cpf)
////                .mapTo(Customer.class)
////                .findFirst()
//////                .map(customer -> customer.copy().build())
////                ))
////        .flatMap(Mono::justOrEmpty);
//		return Mono.justOrEmpty(null);
//	}
//
////	private <T> Mono<T> async(Callable<T> supplier) {
////		return Mono.fromCallable(supplier)
////				   .subscribeOn(jdbcScheduler)
////				   .publishOn(Schedulers.parallel());
////	}
//
//}
