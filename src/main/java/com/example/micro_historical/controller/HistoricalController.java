package com.example.micro_historical.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.micro_historical.entity.Transaction;
import com.example.micro_historical.service.ITransactionService;



@RestController
public class HistoricalController {
	
	private Logger log = LoggerFactory.getLogger(HistoricalController.class) ;
	
	@Autowired
	private ITransactionService transaction;
	
	@GetMapping("/transaction/{nroprestamo}/{cuota}")
	public ResponseEntity<?> obtenerTransacciones(@PathVariable Integer nroprestamo , @PathVariable Integer cuota){
		log.info("id : {} ", transaction.findByAccountID(nroprestamo));
		Iterable<Transaction> itransaction = transaction.findByNroprestamoAndCuota(nroprestamo, cuota);
		
		return ResponseEntity.ok(itransaction);
	}
	
	@GetMapping("/listar")
	public List<Transaction> listar(){
		return (List<Transaction>)transaction.findAll();
	}
	
	

}
