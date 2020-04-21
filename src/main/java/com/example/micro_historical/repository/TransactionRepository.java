package com.example.micro_historical.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.micro_historical.entity.Transaction;



@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
	
	
	@Query("{'accountId': ?0}")
	public Iterable<Transaction> findByAccountId(Integer accountId);

	@Query("{'nroprestamo': ?0 , 'cuota' : ?1}")
	public Iterable <Transaction> findByNroprestamoAndCuota(int nroprestamo, int cuota);

}
