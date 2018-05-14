package com.aakruth.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aakruth.model.Debit;
@Repository("deditRepository")
interface DebitRepository extends DataTablesRepository<Debit, Integer>,CrudRepository<Debit, Integer>{
	List<Debit> findByStaAndTypeOfPayment(char sta,char type);
	
	/*@Query(value = "SELECT debit FROM com.aakruth.model.Debit debit JOIN FETCH debit.dealer dealer JOIN FETCH debit.transaction tran WHERE debit.debId =:debId")
	Debit findOne(@Param("debId")Integer debId);*/
	
	List<Debit> findByStrdteBetween(Date start, Date end);
}
