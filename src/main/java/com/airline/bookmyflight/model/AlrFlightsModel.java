/**
 * 
 */
package com.airline.bookmyflight.model;

import java.time.LocalDateTime;

/**
 * @author GyanTree
 *
 */
public class AlrFlightsModel {

	private String flightId;
	private String originAp;
	private String destAp;
	private LocalDateTime depTime;
	private LocalDateTime arrTime;

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
	 * @return the originAp
	 */
	public String getOriginAp() {
		return originAp;
	}

	/**
	 * @param originAp the originAp to set
	 */
	public void setOriginAp(String originAp) {
		this.originAp = originAp;
	}

	/**
	 * @return the destAp
	 */
	public String getDestAp() {
		return destAp;
	}

	/**
	 * @param destAp the destAp to set
	 */
	public void setDestAp(String destAp) {
		this.destAp = destAp;
	}

	/**
	 * @return the depTime
	 */
	public LocalDateTime getDepTime() {
		return depTime;
	}

	/**
	 * @param depTime the depTime to set
	 */
	public void setDepTime(LocalDateTime depTime) {
		this.depTime = depTime;
	}

	/**
	 * @return the arrTime
	 */
	public LocalDateTime getArrTime() {
		return arrTime;
	}

	/**
	 * @param arrTime the arrTime to set
	 */
	public void setArrTime(LocalDateTime arrTime) {
		this.arrTime = arrTime;

	}

	@Override
	public String toString() {
		return "AirlineFlights [flightId=" + flightId + ", originAp=" + originAp + ", destAp=" + destAp + ", depTime="
				+ depTime + ", arrTime=" + arrTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flightId == null) ? 0 : flightId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AlrFlightsModel)) {
			return false;
		}
		AlrFlightsModel other = (AlrFlightsModel) obj;
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
