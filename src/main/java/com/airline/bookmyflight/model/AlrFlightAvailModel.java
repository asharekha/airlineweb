package com.airline.bookmyflight.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AlrFlightAvailModel {

	private String flightId;
	private LocalDateTime flightDate;
	private Integer seats;
	private BigDecimal cost;

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
	 * @return the flightDate
	 */
	public LocalDateTime getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate the flightDate to set
	 */
	public void setFlightDate(LocalDateTime flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the seats
	 */
	public Integer getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "AirFlightAvail [flightId=" + flightId + ", flightDate=" + flightDate + ", seats=" + seats + ", cost="
				+ cost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flightDate == null) ? 0 : flightDate.hashCode());
		result = prime * result + ((flightId == null) ? 0 : flightId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AlrFlightAvailModel)) {
			return false;
		}
		AlrFlightAvailModel other = (AlrFlightAvailModel) obj;
		if (flightDate == null) {
			if (other.flightDate != null) {
				return false;
			}
		} else if (!flightDate.equals(other.flightDate)) {
			return false;
		}
		if (flightId == null) {
			if (other.flightId != null) {
				return false;
			}
		} else if (!flightId.equals(other.flightId)) {
			return false;
		}
		return true;
	}

}
