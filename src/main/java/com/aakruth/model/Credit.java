package com.aakruth.model;
// Generated Apr 16, 2017 12:21:33 AM by Hibernate Tools 5.2.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Credit generated by hbm2java
 */
@Entity
@Table(name = "credit", catalog = "aakruthdb")
public class Credit implements java.io.Serializable {

	@JsonView(DataTablesOutput.View.class)
	private Integer credId;
	@JsonView(DataTablesOutput.View.class)
	private Dealer dealer;
	@JsonView(DataTablesOutput.View.class)
	private Transaction transaction;
	@JsonView(DataTablesOutput.View.class)
	private String voucherNo;
	@JsonView(DataTablesOutput.View.class)
	private int typeOfPayment;
	@JsonView(DataTablesOutput.View.class)
	private BigDecimal amount;
	@JsonView(DataTablesOutput.View.class)
	private BigDecimal vat;
	@JsonView(DataTablesOutput.View.class)
	private Date strdte;
	private Date enddte;
	@JsonView(DataTablesOutput.View.class)
	private String particulars;
	@JsonView(DataTablesOutput.View.class)
	private String remarks;
	private char sta;

	@Override
	public String toString() {
		return "Credit [credId=" + credId + ", dealer=" + dealer + ", transaction=" + transaction + ", voucherNo="
				+ voucherNo + ", typeOfPayment=" + typeOfPayment + ", amount=" + amount + ", vat=" + vat + ", strdte="
				+ strdte + ", enddte=" + enddte + ", particulars=" + particulars + ", remarks=" + remarks + ", sta="
				+ sta + "]";
	}

	public Credit() {
	}

	public Credit(Transaction transaction, String voucherNo, int typeOfPayment, BigDecimal amount, BigDecimal vat,
			Date strdte, Date enddte, String particulars, String remarks, char sta) {
		this.transaction = transaction;
		this.voucherNo = voucherNo;
		this.typeOfPayment = typeOfPayment;
		this.amount = amount;
		this.vat = vat;
		this.strdte = strdte;
		this.enddte = enddte;
		this.particulars = particulars;
		this.remarks = remarks;
		this.sta = sta;
	}

	public Credit(Dealer dealer, Transaction transaction, String voucherNo, int typeOfPayment, BigDecimal amount,
			BigDecimal vat, Date strdte, Date enddte, String particulars, String remarks, char sta) {
		this.dealer = dealer;
		this.transaction = transaction;
		this.voucherNo = voucherNo;
		this.typeOfPayment = typeOfPayment;
		this.amount = amount;
		this.vat = vat;
		this.strdte = strdte;
		this.enddte = enddte;
		this.particulars = particulars;
		this.remarks = remarks;
		this.sta = sta;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cred_Id", unique = true, nullable = false)
	public Integer getCredId() {
		return this.credId;
	}

	public void setCredId(Integer credId) {
		this.credId = credId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dealer_id")
	public Dealer getDealer() {
		return this.dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type", nullable = false)
	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Column(name = "voucher_no", nullable = false, length = 45)
	public String getVoucherNo() {
		return this.voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	@Column(name = "type_of_payment", nullable = false)
	public int getTypeOfPayment() {
		return this.typeOfPayment;
	}

	public void setTypeOfPayment(int typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}

	@Column(name = "amount", nullable = false, precision = 10)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "vat", nullable = false, precision = 10)
	public BigDecimal getVat() {
		return this.vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "strdte", nullable = false, length = 10)
	public Date getStrdte() {
		return this.strdte;
	}

	public void setStrdte(Date strdte) {
		this.strdte = strdte;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "enddte", nullable = false, length = 10)
	public Date getEnddte() {
		return this.enddte;
	}

	public void setEnddte(Date enddte) {
		this.enddte = enddte;
	}

	@Column(name = "particulars", nullable = false, length = 100)
	public String getParticulars() {
		return this.particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	@Column(name = "remarks", nullable = false, length = 100)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "sta", nullable = false, length = 1)
	public char getSta() {
		return this.sta;
	}

	public void setSta(char sta) {
		this.sta = sta;
	}

}
