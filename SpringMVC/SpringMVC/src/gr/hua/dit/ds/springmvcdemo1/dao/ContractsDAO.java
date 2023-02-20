package gr.hua.dit.ds.springmvcdemo1.dao;

import gr.hua.dit.ds.springmvcdemo1.entity.Contracts;

import java.util.ArrayList;
import java.util.List;

public interface ContractsDAO {

	public List<Contracts> getContracts();

	public List<Contracts> getAllSubjectsByUsername(String username);
	public void UpdateContract(int id, String state);
	public void InsertContracts(Contracts subjects);
	public void UpdateContract_2(int id, String state2);
	public  ArrayList<Contracts> ReturnClassification(int id);



}