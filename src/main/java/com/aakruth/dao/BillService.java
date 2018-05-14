package com.aakruth.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.aakruth.model.BillTbl;

public interface BillService {
	BillTbl findOne(Integer billId);
	DataTablesOutput<BillTbl> findAll(DataTablesInput input);
	boolean save(BillTbl bill);
	//@PreAuthorize("hasRole('ADMIN')")
	boolean edit(BillTbl bill);
	//@PreAuthorize("hasRole('ADMIN')")
	boolean delete(Integer billId);
	List<BillTbl> findByEntryDteBetween(Date from, Date to);

}
