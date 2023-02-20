package gr.hua.dit.ds.restdemo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "forma")
public class Contracts implements Serializable{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "sub1")
	private String sub1;

	@Column(name = "sub2")
	private String sub2;

	@Column(name = "sub3")
	private String sub3;

	@Column(name = "sub4")
	private String sub4;

	@Column(name = "sub5")
	private String sub5;

	@Column(name = "sub6")
	private String sub6;

	@Column(name = "sub7")
	private String sub7;

	@Column(name = "sub8")
	private String sub8;

	@Column(name = "sub9")
	private String sub9;

	@Column(name = "sub10")
	private String sub10;
	
	@Column(name = "sub11")
	private String sub11;

	@Column(name = "sub12")
	private String sub12;

	@Column(name = "sub13")
	private String sub13;

	@Column(name = "sub14")
	private String sub14;

	@Column(name = "sub15")
	private String sub15;

	@Column(name = "sub16")
	private String sub16;

	@Column(name = "sub17")
	private String sub17;

	@Column(name = "sub18")
	private String sub18;


	@Column(name = "state")
	private String state;

	@Column(name = "state2")
	private String state2;

	@Column(name = "teachername1")
	private String teachername1;

	@Column(name = "teachername2")
	private String teachername2;


	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,CascadeType.REFRESH })
	@JoinColumn(name = "username", nullable = false)
	private User user;

	//Constructors
	public Contracts() {
		super();
	}

	public Contracts(User user, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6, String sub7, String sub8, String sub9, String sub10, String sub11, String sub12, String sub13, String sub14, String sub15, String sub16, String sub17, String sub18, double grade2, String teachername1, String teachername2, String state, String state2) {
		super();
		this.user = user;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.sub7 = sub7;
		this.sub8 = sub8;
		this.sub9 = sub9;
		this.sub10 = sub10;
		this.sub11 = sub11;
		this.sub12 = sub12;
		this.sub13 = sub13;
		this.sub14 = sub14;
		this.sub15 = sub15;
		this.sub16 = sub16;
		this.sub17 = sub17;
		this.sub18 = sub18;
		this.state = state;
		this.state2 = state2;
		this.teachername1 = teachername1;
		this.teachername2 = teachername2;
	}

	public String getSub15() {
		return sub15;
	}

	public void setSub15(String sub15) {
		this.sub15 = sub15;
	}

	public String getSub16() {
		return sub16;
	}

	public void setSub16(String sub16) {
		this.sub16 = sub16;
	}

	public String getSub17() {
		return sub17;
	}

	public void setSub17(String sub17) {
		this.sub17 = sub17;
	}

	public String getSub18() {
		return sub18;
	}

	public void setSub18(String sub18) {
		this.sub18 = sub18;
	}
//Setters+getters


	public int getId() {
		return id;
	}

	public String getSub12() {
		return sub12;
	}

	public void setSub12(String sub12) {
		this.sub12 = sub12;
	}

	public String getSub13() {
		return sub13;
	}

	public void setSub13(String sub13) {
		this.sub13 = sub13;
	}

	public String getSub14() {
		return sub14;
	}

	public void setSub14(String sub14) {
		this.sub14 = sub14;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub9() {
		return sub9;
	}

	public void setSub9(String sub9) {
		this.sub9 = sub9;
	}

	public String getSub10() {
		return sub10;
	}

	public void setSub10(String sub10) {
		this.sub10 = sub10;
	}

	public String getSub11() {
		return sub11;
	}

	public void setSub11(String sub11) {
		this.sub11 = sub11;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub8() {
		return sub8;
	}

	public void setSub8(String sub8) {
		this.sub8 = sub8;
	}

	public String getSub7() {
		return sub7;
	}

	public void setSub7(String sub7) {
		this.sub7 = sub7;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	public String getSub4() {
		return sub4;
	}

	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}

	public String getSub5() {
		return sub5;
	}

	public void setSub5(String sub5) {
		this.sub5 = sub5;
	}

	public String getSub6() {
		return sub6;
	}

	public void setSub6(String sub6) {
		this.sub6 = sub6;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getTeachername1() {
		return teachername1;
	}

	public void setTeachername1(String teachername1) {
		this.teachername1 = teachername1;
	}

	public String getTeachername2() {
		return teachername2;
	}

	public void setTeachername2(String teachername2) {
		this.teachername2 = teachername2;
	}

	@Override
	public String toString() {
		return "Subjects{" +
				"id=" + id +
				", sub1='" + sub1 + '\'' +
				", sub2='" + sub2 + '\'' +
				", sub3='" + sub3 + '\'' +
				", sub4='" + sub4 + '\'' +
				", sub5='" + sub5 + '\'' +
				", sub6='" + sub6 + '\'' +
				", sub7='" + sub7 + '\'' +
				", sub8='" + sub8 + '\'' +
				", sub9='" + sub9 + '\'' +
				", sub10='" + sub10 + '\'' +
				", sub11='" + sub11 + '\'' +
				", sub12='" + sub12 + '\'' +
				", sub13='" + sub13 + '\'' +
				", sub14='" + sub14 + '\'' +
				", sub15='" + sub15 + '\'' +
				", sub16='" + sub16 + '\'' +
				", sub17='" + sub17 + '\'' +
				", sub18='" + sub18 + '\'' +
				", state='" + state + '\'' +
				", state2='" + state2 + '\'' +
				", teachername1='" + teachername1 + '\'' +
				", teachername2='" + teachername2 + '\'' +
				", user=" + user +
				'}';
	}
}
