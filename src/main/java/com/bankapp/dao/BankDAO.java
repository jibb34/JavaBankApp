package com.bankapp.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 * Session Bean implementation class BankDAO
 */
@Stateless
@LocalBean
public class BankDAO {
	@PersistenceContext(unitName="BankDAO")
	EntityManager em;
//TODO: Create functions for CRUD operations for Students and Accounts
    public BankDAO() {
    }
//TODO: Create Business Logic for operations Withdraw & Transfer
}
