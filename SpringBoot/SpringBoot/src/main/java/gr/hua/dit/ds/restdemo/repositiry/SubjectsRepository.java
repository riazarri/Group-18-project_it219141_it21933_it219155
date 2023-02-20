package gr.hua.dit.ds.restdemo.repositiry;

import java.util.List;

import gr.hua.dit.ds.restdemo.entity.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import gr.hua.dit.ds.restdemo.entity.User;

public interface SubjectsRepository extends JpaRepository<Contracts, Integer> {



	//find dayoffs By State
	@Query("SELECT d FROM Contracts d where d.state = :state")
	List<Contracts> findByState(@Param("state") String state);

	//Update dayoffs State by ID
	@Query("Update Contracts d SET d.state=':state' Where d.id=:id")
	void UpdateDayoffState(@Param("state") String state,@Param("id") int id);

	@Query("SELECT d FROM Contracts d where d.user=:user")
	List<Contracts> findByUsername(@Param("user")User user);






}
