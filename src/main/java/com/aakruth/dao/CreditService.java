package com.aakruth.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.aakruth.model.Credit;
import com.aakruth.model.Transaction;


public interface CreditService {

	Credit findOne(Integer credId);
	DataTablesOutput<Credit> findAll(DataTablesInput input);
	boolean save(Credit credit);
	boolean edit(Credit credit);
	boolean delete(Integer credId);
	List<Credit> findBySta(char sta);
	List<Transaction> findByType(char type);
	List<Credit> findByStrdteBetween(Date start, Date end);
}
