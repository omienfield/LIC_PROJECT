package com.lic.starter.jpa.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lic.starter.converter.DateConverter;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

@Entity
@Table(name = "client_details", schema = "lic_details")
public class ClientDetails {

	@Id
	@Column(name = "policy_no")
	@CsvBindByName(column="policyno")
	private Integer policyNo;

	@Column(name = "name")
	private String name;

	@Column(name = "date_of_comm")
	@CsvCustomBindByName(column="commencementdate",converter= DateConverter.class) 
	private Date commencementDate;

	@Column(name = "plan_term")
	private String planTerm;

	@Column(name = "premium_mode")
	private char mode;

	@Column(name = "premium")
	private Double premium;

	@Column(name = "place")
	private String location;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name = "maturity_date")
	private LocalDate maturityDate;

	public ClientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientDetails(Integer policyNo, String name, Date commencementDate, String planTerm, char mode,
			Double premium, String location, LocalDate dateOfBirth, LocalDate maturityDate) {
		super();
		this.policyNo = policyNo;
		this.name = name;
		this.commencementDate = commencementDate;
		this.planTerm = planTerm;
		this.mode = mode;
		this.premium = premium;
		this.location = location;
		this.dateOfBirth = dateOfBirth;
		this.maturityDate = maturityDate;
	}
 
	 public Integer getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(Integer policyNo) {
		this.policyNo = policyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCommencementDate() {
		return commencementDate;
	}
	
	public void setCommencementDate(Date commencementDate) {
		this.commencementDate = commencementDate;
	}

	public String getPlanTerm() {
		return planTerm;
	}

	public void setPlanTerm(String planTerm) {
		this.planTerm = planTerm;
	}

	public char getMode() {
		return mode;
	}

	public void setMode(char mode) {
		this.mode = mode;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

}
