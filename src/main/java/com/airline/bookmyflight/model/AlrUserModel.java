/**
 * 
 */
package com.airline.bookmyflight.model;

/**
 * @author Asha Rekha
 *
 */
public class AlrUserModel {

	private String userId;
	private String username;
	private String passwd;
	private Long creditCardNo;
	private Character creditCardType;
	private Integer creditCardMonth;
	private Integer creditCardXYear;
	private Integer age;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Long getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(Long creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public Character getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(Character creditCardType) {
		this.creditCardType = creditCardType;
	}

	public Integer getCreditCardMonth() {
		return creditCardMonth;
	}

	public void setCreditCardMonth(Integer creditCardMonth) {
		this.creditCardMonth = creditCardMonth;
	}

	public Integer getCreditCardXYear() {
		return creditCardXYear;
	}

	public void setCreditCardXYear(Integer creditCardXYear) {
		this.creditCardXYear = creditCardXYear;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "AirlineUser [userId=" + userId + ", username=" + username + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AlrUserModel)) {
			return false;
		}
		AlrUserModel other = (AlrUserModel) obj;
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		return true;
	}

}
