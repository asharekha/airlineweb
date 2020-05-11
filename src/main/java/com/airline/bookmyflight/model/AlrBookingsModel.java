package com.airline.bookmyflight.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AlrBookingsModel {

	private Long referenceId;
	private String userId;
	private String flightId;
	private String status;
	private Integer bookSeats;
	private BigDecimal totalCost;
	private LocalDateTime travelDate;

	/**
	 * @return the referenceId
	 */
	public long getReferenceId() {
		return referenceId;
	}

	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(long referenceId) {
		this.referenceId = referenceId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the flightId
	 */
	public String getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the bookSeats
	 */
	public Integer getBookSeats() {
		return bookSeats;
	}

	/**
	 * @param bookSeats the bookSeats to set
	 */
	public void setBookSeats(Integer bookSeats) {
		this.bookSeats = bookSeats;
	}

	/**
	 * @return the totalCost
	 */
	public BigDecimal getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	/**
	 * @return the travelDate
	 */
	public LocalDateTime getTravelDate() {
		return travelDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((referenceId == null) ? 0 : referenceId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AlrBookingsModel)) {
			return false;
		}
		AlrBookingsModel other = (AlrBookingsModel) obj;
		if (referenceId == null) {
			if (other.referenceId != null) {
				return false;
			}
		} else if (!referenceId.equals(other.referenceId)) {
			return false;
		}
		return true;
	}

	/**
	 * @param travelDate the travelDate to set
	 */
	public void setTravelDate(LocalDateTime travelDate) {
		this.travelDate = travelDate;
	}

	@Override
	public String toString() {
		return "AlrBookings [referenceId=" + referenceId + ", userId=" + userId + ", flightId=" + flightId + ", status="
				+ status + ", bookSeats=" + bookSeats + ", totalCost=" + totalCost + ", travelDate=" + travelDate + "]";
	}

}
