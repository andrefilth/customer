package com.br.pan.client.endpoint;

import static com.br.pan.client.constants.Constants.CONTEXT_PATH;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.pan.client.services.CustomerService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(CONTEXT_PATH)
public class CustomerEndpoint {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerEndpoint.class);
	
	private final CustomerService customerService;
	
	@Autowired
	public CustomerEndpoint(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/orders")
    public Mono<ResponseEntity<List<Object>>> findCustomer(@RequestParam(value = "cpf", required = true) String cpf) {

        LOG.info("Buscar informações de Customer por CPF: [{}] ", cpf);

         customerService.findByCpf(cpf)
        		. doOnSuccess(cus -> LOG.info("Encontrado custumer [{}]", cus));
//                .map(OrderItemResponse::new)
//                .collectList()
        		return Mono.justOrEmpty(null);
    }
}
