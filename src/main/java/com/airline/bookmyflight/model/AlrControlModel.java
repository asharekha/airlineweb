package com.airline.bookmyflight.model;

public class AlrControlModel {
	private String ctrlName;
	private Integer ctrlValue;

	/**
	 * @return the ctrlName
	 */
	public String getCtrlName() {
		return ctrlName;
	}

	/**
	 * @param ctrlName the ctrlName to set
	 */
	public void setCtrlName(String ctrlName) {
		this.ctrlName = ctrlName;
	}

	/**
	 * @return the ctrlValue
	 */
	public Integer getCtrlValue() {
		return ctrlValue;
	}

	/**
	 * @param ctrlValue the ctrlValue to set
	 */
	public void setCtrlValue(Integer ctrlValue) {
		this.ctrlValue = ctrlValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ctrlName == null) ? 0 : ctrlName.hashCode());
		result = prime * result + ((ctrlValue == null) ? 0 : ctrlValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AlrControlModel)) {
			return false;
		}
		AlrControlModel other = (AlrControlModel) obj;
		if (ctrlName == null) {
			if (other.ctrlName != null) {
				return false;
			}
		} else if (!ctrlName.equals(other.ctrlName)) {
			return false;
		}
		if (ctrlValue == null) {
			if (other.ctrlValue != null) {
				return false;
			}
		} else if (!ctrlValue.equals(other.ctrlValue)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AlrControl [ctrlName=" + ctrlName + ", ctrlValue=" + ctrlValue + "]";
	}

}
