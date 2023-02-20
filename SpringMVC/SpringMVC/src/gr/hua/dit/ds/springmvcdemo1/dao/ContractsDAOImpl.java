package gr.hua.dit.ds.springmvcdemo1.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.springmvcdemo1.entity.Contracts;

@Repository
public class ContractsDAOImpl implements ContractsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Contracts> getContracts() {

		Session currentSession = this.sessionFactory.openSession(); // Get current hibernate session

		Query<Contracts> query = currentSession.createQuery("select u from Contracts u", Contracts.class);

		List<Contracts> req = query.getResultList();

		return req;
	}

	@Override
	public void InsertContracts(Contracts contracts) {
		Session currentSession = this.sessionFactory.openSession();

		try {

			currentSession.beginTransaction();
			currentSession.save(contracts);

			currentSession.getTransaction().commit();

		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
			currentSession.getTransaction().rollback();

		} finally {

			currentSession.close();

		}

	}


	@Override
	public List<Contracts> getAllSubjectsByUsername(String username) {
		List<Contracts> contracts= new ArrayList<>();

		Session currentSession = this.sessionFactory.openSession(); // Get current hibernate session

		try {

			Query query = currentSession.createQuery("from Contracts where username=:username", Contracts.class); // Create a query

			query.setParameter("username", username);
			contracts = query.getResultList();

		} catch (Exception e) {

			System.out.println("exception: " + e.getMessage());

		} finally {

			currentSession.close(); // Close session
		}


		return contracts;

	}


	public void UpdateContract_2(int id, String state2) {
		Session currentSession = this.sessionFactory.openSession();

		try {

			currentSession.beginTransaction();

			Contracts contracts = currentSession.get(Contracts.class, id);

			contracts.setState(state2);
			currentSession.update(contracts);

			currentSession.getTransaction().commit();

			System.out.println("ok");

		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());

			currentSession.getTransaction().rollback();

		} finally {

			currentSession.close(); // Close session

		}
	}

	@Override
	public void UpdateContract(int id, String state) {
		Session currentSession = this.sessionFactory.openSession();

		try {

			currentSession.beginTransaction();

			Contracts contracts = currentSession.get(Contracts.class, id);

			contracts.setState(state);
			currentSession.update(contracts);

			currentSession.getTransaction().commit();

			System.out.println("ok");

		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());

			currentSession.getTransaction().rollback();

		} finally {

			currentSession.close(); // Close session

		}

	}



	@Override
	public ArrayList<Contracts> ReturnClassification(int id) {
		Session currentSession = this.sessionFactory.openSession();
		ArrayList<Contracts> contracts1 = new ArrayList<Contracts>();

		return contracts1;
	}


}
