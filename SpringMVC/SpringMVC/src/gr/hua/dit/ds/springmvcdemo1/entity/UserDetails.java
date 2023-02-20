package gr.hua.dit.ds.springmvcdemo1.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "userDetails")
public class UserDetails implements Serializable{

	@Id
	@Column(name = "username")
    private String username;


    
    @OneToOne(fetch = FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
	@PrimaryKeyJoinColumn
	private User user;

	//Constructors
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String username) {
		super();
		this.username = username;

	}

	
	//Setters+Getters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
	
}
