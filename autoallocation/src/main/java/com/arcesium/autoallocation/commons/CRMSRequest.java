package com.arcesium.autoallocation.commons;

import java.util.Date;

public class CRMSRequest {

	private int requestId;

	private String purpose;

	private Date departureDate;

	private String departureTime;

	private String pickup;

	private String pickupPoint;

	private String drop;

	private String dropPoint;

	private String comments;

	public CRMSRequest() {
	}

	public CRMSRequest(String purpose, Date departureDate, String departureTime, String drop, String dropPoint) {
		this.purpose = purpose;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.pickup = "Office";
		this.pickupPoint = "Arcesium India Pvt Ltd";
		this.drop = drop;
		this.dropPoint = dropPoint;
		this.comments = "";
	}

	public CRMSRequest(String purpose, Date departureDate, String departureTime, String pickup, String pickupPoint,
			String drop, String dropPoint) {
		this.purpose = purpose;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.pickup = pickup;
		this.pickupPoint = pickupPoint;
		this.drop = drop;
		this.dropPoint = dropPoint;
		this.comments = "";
	}

	public CRMSRequest(String purpose, Date departureDate, String departureTime, String pickup, String pickupPoint,
			String drop, String dropPoint, String comments) {
		this.purpose = purpose;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.pickup = pickup;
		this.pickupPoint = pickupPoint;
		this.drop = drop;
		this.dropPoint = dropPoint;
		this.comments = comments;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getPickupPoint() {
		return pickupPoint;
	}

	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}

	public String getDrop() {
		return drop;
	}

	public void setDrop(String drop) {
		this.drop = drop;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((drop == null) ? 0 : drop.hashCode());
		result = prime * result + ((dropPoint == null) ? 0 : dropPoint.hashCode());
		result = prime * result + ((pickup == null) ? 0 : pickup.hashCode());
		result = prime * result + ((pickupPoint == null) ? 0 : pickupPoint.hashCode());
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		result = prime * result + requestId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CRMSRequest other = (CRMSRequest) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (drop == null) {
			if (other.drop != null)
				return false;
		} else if (!drop.equals(other.drop))
			return false;
		if (dropPoint == null) {
			if (other.dropPoint != null)
				return false;
		} else if (!dropPoint.equals(other.dropPoint))
			return false;
		if (pickup == null) {
			if (other.pickup != null)
				return false;
		} else if (!pickup.equals(other.pickup))
			return false;
		if (pickupPoint == null) {
			if (other.pickupPoint != null)
				return false;
		} else if (!pickupPoint.equals(other.pickupPoint))
			return false;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		if (requestId != other.requestId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CRMSRequest [requestId=" + requestId + ", purpose=" + purpose + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", pickup=" + pickup + ", pickupPoint=" + pickupPoint + ", drop="
				+ drop + ", dropPoint=" + dropPoint + ", comments=" + comments + "]";
	}

}
