package com.bankapp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Accounts database table.
 * 
 */
@Entity
@Table(name="Accounts")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountID;

	@Lob
	private String accountAlias;

	private int accountBalance;

	//bi-directional many-to-one association to Student
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="studentID")
	private Student student;

	public Account() {
	}

	public int getAccountID() {
		return this.accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountAlias() {
		return this.accountAlias;
	}

	public void setAccountAlias(String accountAlias) {
		this.accountAlias = accountAlias;
	}

	public int getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}