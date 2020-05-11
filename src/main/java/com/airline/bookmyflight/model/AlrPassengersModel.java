package com.airline.bookmyflight.model;

public class AlrPassengersModel {

	private Long ticketNumber;
	private Long referenceId;
	private String passName;
	private Integer age;
	private Character status;

	/**
	 * @return the ticketNumber
	 */
	public Long getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(Long ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * @return the referenceId
	 */
	public Long getReferenceId() {
		return referenceId;
	}

	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	/**
	 * @return the passName
	 */
	public String getPassName() {
		return passName;
	}

	/**
	 * @param passName the passName to set
	 */
	public void setPassName(String passName) {
		this.passName = passName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the status
	 */
	public Character getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Character status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ticketNumber == null) ? 0 : ticketNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AlrPassengersModel)) {
			return false;
		}
		AlrPassengersModel other = (AlrPassengersModel) obj;
		if (ticketNumber == null) {
			if (other.ticketNumber != null) {
				return false;
			}
		} else if (!ticketNumber.equals(other.ticketNumber)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AlrPassengers [ticketNumber=" + ticketNumber + ", referenceId=" + referenceId + ", passName=" + passName
				+ ", age=" + age + ", status=" + status + "]";
	}

}