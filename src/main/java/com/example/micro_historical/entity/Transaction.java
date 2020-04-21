package com.example.micro_historical.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {

	private String id;
	
	private int nroprestamo;
	
	private double importeCuota;
	
	private int cuota;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNroprestamo() {
		return nroprestamo;
	}

	public void setNroprestamo(int nroprestamo) {
		this.nroprestamo = nroprestamo;
	}

	public double getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	

	

}
