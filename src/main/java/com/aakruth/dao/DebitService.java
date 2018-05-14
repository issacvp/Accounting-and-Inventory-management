package com.aakruth.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.aakruth.model.Debit;
import com.aakruth.model.Transaction;

public interface DebitService {
	Debit findOne(Integer debId);
	DataTablesOutput<Debit> findAll(DataTablesInput input);
	boolean save(Debit debit);
	boolean edit(Debit debit);
	boolean delete(Integer debId);
	List<Debit> findByStaAndTypeOfPayment(char type);
	List<Transaction> findByType(char type);
	List<Debit> findByStrdteBetween(Date start, Date end);
}
