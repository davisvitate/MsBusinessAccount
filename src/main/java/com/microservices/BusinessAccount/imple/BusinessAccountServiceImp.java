package com.microservices.BusinessAccount.imple;

import com.microservices.BusinessAccount.model.BusinessAccount;
import com.microservices.BusinessAccount.service.BusinessAccountServInterface;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class BusinessAccountServiceImp implements BusinessAccountServInterface{

	@Override
	public Flux<BusinessAccount> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<BusinessAccount> findAllName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BusinessAccount> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BusinessAccount> save(BusinessAccount bk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(BusinessAccount cli) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
