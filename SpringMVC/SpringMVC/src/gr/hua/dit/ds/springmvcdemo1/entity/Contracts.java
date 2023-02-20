package gr.hua.dit.ds.springmvcdemo1.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

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
import gr.hua.dit.ds.springmvcdemo1.entity.User;


//forma me ta subscriptions tou pinaka forma stin basi
@Entity
@Table(name = "forma")
public class Contracts implements Serializable {

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
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "username", nullable = false)
	private User user;

	//Constructors
	public Contracts() {
		super();
	}

	public Contracts(User user, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6, String sub7, String sub8, String sub9, String sub10, String sub11, String sub12, String sub13, String sub14, String sub15, String sub16, String sub17, String sub18, String teachername1, String teachername2, String state, String state2) {
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

	//Setters+getters


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub15() {
		return sub15;
	}

	public void setSub15(String sub15) {
		this.sub15 = sub15;
	}

	public String getSub18() {
		return sub18;
	}

	public void setSub18(String sub18) {
		this.sub18 = sub18;
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

	public String getSub7() {
		return sub7;
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

	public String getSub8() {
		return sub8;
	}

	public String getSub10() {
		return sub10;
	}

	public void setSub10(String sub10) {
		this.sub10 = sub10;
	}

	public void setSub8(String sub8) {
		this.sub8 = sub8;
	}

	public String getSub11() {
		return sub11;
	}

	public void setSub11(String sub11) {
		this.sub11 = sub11;
	}

	public String getSub9() {
		return sub9;
	}

	public void setSub9(String sub9) {
		this.sub9 = sub9;
	}

	public void setSub7(String sub7) {
		this.sub7 = sub7;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
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
	//me auton ton setter pou ton kalw sthn jsp selida getreq ftiaxnv to sumbolaio toy dikigorou tou dikigorou
	public void setTeachername1( String variable1, String variable2, String variable3, String variable4, String variable5, String variable6, String variable7, String variable8, String variable9, String variable10, String variable11,String variable12, String variable13, String variable14,String variable15, String variable16, String variable17,String variable18, String variable19, String variable20) {
		this.teachername1 = "In " + variable6 +
				" today " + variable5 +
				" the undersigned " + variable1 + " of " + variable12 + " and " + variable11 + " ,resident of " + variable6 + " (" + variable15 + ") holder of the AMKA: " + variable7 + " and on the other hand " + variable2 + " of " + variable14 + " and " + variable13 + " ,resident of " + variable6 + " (" + variable16 + ") holder of the AMKA: " + variable8 + " agreed and accepted the following: .We performed a legal civil marriage (by both parties) and we had " + variable17 + " children.Already with our present written agreement, according to article 1441 of the Civil Code, we agree that we do not wish the continuation of this marriage and we wish and consent to its dissolution, by issuing a consensual divorce.We further state that more than six months have passed since our marriage, and that a written agreement has been drawn up between us regarding the custody of our minor daughter and our communication with her.\n" +
				" Finally, we declare that we are appointing our attorneys, the first being " + variable3 + " and the second being me .Both lawyers and residents of " + variable6 + " with whom we will appear ourselves during the discussion of our relevant application, before the competent Single Member Court of First Instance of Corinth and to whom we give the special mandate to sign our present agreement.";

	}

	public String getTeachername2() {
		return teachername2;
	}

	public void setTeachername2(String teachername2) {
		this.teachername2 = teachername2;
	}

	public void setTeachername2( String variable1, String variable2, String variable3, String variable4, String variable5, String variable6, String variable7, String variable8, String variable9, String variable10, String variable11,String variable12, String variable13, String variable14,String variable15, String variable16, String variable17,String variable18, String variable19, String variable20) {
		this.teachername2 = "In " + variable6 +
				" today " + variable5 +
				" in my office located at " +variable6+ " to me the notary "+variable14+ " those not exempt from the law appeared:\n" +
				"On the one hand: " + variable1 + " of " + variable12 + " and " + variable11 +  " who declared to me that he appears in this case after the attorney of " +variable3 + " and on the other hand " + variable2 + " of " + variable14 + " and " + variable13 + " Subsequently, the parties requested the drafting of the present deed, with which they stated the following:\n" +
				"they jointly agreed to dissolve their marriage consensually pursuant to articles 1438 and 1441 A.K. as they apply after their amendment by the provisions of article 22 of Law 4509/2017. On "+ variable5 +" they entered into a written agreement for the dissolution of their marriage in the presence of their attorneys-at-law, which was signed by them and their attorneys-at-law (or only their attorneys-at-law, who have been granted a special power of attorney which is used within one month of its signature) a) I ratify the above written agreement of the parties appearing for the consensual dissolution of their marriage, and for the regulation of the custody of their minor children, communication with them and their maintenance, which, as mentioned above, bears the certification of the authenticity of the signature them by the Secretariat of the Magistrate's Court\n" +
				"b) I confirm the dissolution of their marriage.\n" +
				"Also, I, the notary public, pointed out to the parties that the dissolution of their marriage occurs by filing a copy of my present deed at the Registry Office of the place where the marriage was registered.";

	}
}