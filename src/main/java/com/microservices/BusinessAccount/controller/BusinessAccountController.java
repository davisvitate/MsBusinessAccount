package com.microservices.BusinessAccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.BusinessAccount.imple.BusinessAccountServiceImp;
import com.microservices.BusinessAccount.model.BusinessAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/businessaccount")
public class BusinessAccountController {
	
	@Autowired
	BusinessAccountServiceImp ceuntaempresarial;
	
	@GetMapping("/all")
	public Flux<BusinessAccount> findAll(){
		return ceuntaempresarial.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<BusinessAccount> getById(@PathVariable String id){
		return ceuntaempresarial.findById(id);
	}
	
	@GetMapping("delete/{id}")
	public Mono<BusinessAccount>deleteById(@PathVariable String id){
		return ceuntaempresarial.findById(id)
				.switchIfEmpty(Mono.error(new Exception("Client not found")));
	} 
	@GetMapping("upadate/{id}")
	public Mono<BusinessAccount> updateClient(@PathVariable String Id) {
		 return ceuntaempresarial.findById(Id)
		   .flatMap(ceuntaempresarial::save)
		   .switchIfEmpty(Mono.error(new Exception("cliente no encontrado")));
		}

}
