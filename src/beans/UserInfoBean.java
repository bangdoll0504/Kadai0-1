package beans;

import java.io.Serializable;

public class UserInfoBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private String hobby1;
	private String hobby2;
	private String hobby3;
	private String hobbyCon;

	public UserInfoBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// nameの値に渡された引数を結合する独自ロジック
	public void addName(String value) {
		this.name = this.name + value;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ageの値に渡された引数を加算する独自ロジック
	public void addAge(int value) {
		this.age = this.age + value;
	}

	public String getHobby1() {
		return hobby1;
	}

	public void setHobby1(String hobby1) {
		this.hobby1 = hobby1;
	}

	public String getHobby2() {
		return hobby2;
	}

	public void setHobby2(String hobby2) {
		this.hobby2 = hobby2;
	}

	public String getHobby3() {
		return hobby3;
	}

	public void setHobby3(String hobby3) {
		this.hobby3 = hobby3;
	}

	public String getHobbyCon() {
		return hobbyCon;
	}

	// 3つの引数を結合する独自ロジック
	public void concateHobby(String value1, String value2, String value3) {
		this.hobbyCon = value1 + "," + value2 + "," + value3;
	}


}
