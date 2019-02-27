package com.br.pan.client.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.pan.client.endpoint.response.HealthResponse;

import static com.br.pan.client.constants.Constants.CONTEXT_PATH;

import reactor.core.publisher.Mono;

@RestController
public class HealthEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(HealthEndpoint.class);

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(CONTEXT_PATH + "/health")
    public Mono<HealthResponse> health() {
        return Mono.just(new HealthResponse())
                .doOnSuccess(t -> LOG.info("Status da aplicação [{}]", t));
    }

}