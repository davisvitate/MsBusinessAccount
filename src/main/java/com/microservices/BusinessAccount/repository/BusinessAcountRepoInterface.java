package com.microservices.BusinessAccount.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.BusinessAccount.model.BusinessAccount;

@Repository
public interface BusinessAcountRepoInterface extends ReactiveMongoRepository<BusinessAccount, String>{

}
