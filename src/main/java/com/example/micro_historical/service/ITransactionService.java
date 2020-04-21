package com.example.micro_historical.service;

import com.example.micro_historical.entity.Transaction;

public interface ITransactionService {
	
	public Transaction save ( Transaction transaction );
	public Iterable<Transaction> findByAccountID(Integer accountId);
	public Iterable<Transaction> findAll();
	public Iterable<Transaction> findByNroprestamoAndCuota(int nroprestamo, int cuota);

}
