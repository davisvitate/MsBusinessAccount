package com.microservices.BusinessAccount.service;



import com.microservices.BusinessAccount.model.BusinessAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessAccountServInterface {

public Flux<BusinessAccount> findAll();
	
	public Flux<BusinessAccount>findAllName();
	
	public Mono<BusinessAccount> findById(String id);
	
	public Mono<BusinessAccount> save(BusinessAccount bk);
	
	public Mono<Void> delete(BusinessAccount cli);
}
