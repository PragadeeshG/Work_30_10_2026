package com.test1;

public class CountryPolicyRetentionLimitsAlert {
	private long limitsAlertId;
	private long limitsId;
	private String alertType;
	private String alertSeverity;
	private long thresholdPercentage;
	private long currentUsagePercentage;
	private String alertMessage;
	private String notificationChannel;
	private String alertGeneratedDate;
	private String acknowledgedBy;
	private String acknowledgedDate;
	private String resolvedDate;
	private String alertStatus;

	public CountryPolicyRetentionLimitsAlert() {

	}

	public CountryPolicyRetentionLimitsAlert(long limitsAlertId, long limitsId, String alertType, String alertSeverity,
			long thresholdPercentage, long currentUsagePercentage, String alertMessage, String notificationChannel,
			String alertGeneratedDate, String acknowledgedBy, String acknowledgedDate, String resolvedDate,
			String alertStatus) {
		super();
		this.limitsAlertId = limitsAlertId;
		this.limitsId = limitsId;
		this.alertType = alertType;
		this.alertSeverity = alertSeverity;
		this.thresholdPercentage = thresholdPercentage;
		this.currentUsagePercentage = currentUsagePercentage;
		this.alertMessage = alertMessage;
		this.notificationChannel = notificationChannel;
		this.alertGeneratedDate = alertGeneratedDate;
		this.acknowledgedBy = acknowledgedBy;
		this.acknowledgedDate = acknowledgedDate;
		this.resolvedDate = resolvedDate;
		this.alertStatus = alertStatus;
	}

	public long getLimitsAlertId() {
		return limitsAlertId;
	}

	public void setLimitsAlertId(long limitsAlertId) {
		this.limitsAlertId = limitsAlertId;
	}

	public long getLimitsId() {
		return limitsId;
	}

	public void setLimitsId(long limitsId) {
		this.limitsId = limitsId;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public String getAlertSeverity() {
		return alertSeverity;
	}

	public void setAlertSeverity(String alertSeverity) {
		this.alertSeverity = alertSeverity;
	}

	public long getThresholdPercentage() {
		return thresholdPercentage;
	}

	public void setThresholdPercentage(long thresholdPercentage) {
		this.thresholdPercentage = thresholdPercentage;
	}

	public long getCurrentUsagePercentage() {
		return currentUsagePercentage;
	}

	public void setCurrentUsagePercentage(long currentUsagePercentage) {
		this.currentUsagePercentage = currentUsagePercentage;
	}

	public String getAlertMessage() {
		return alertMessage;
	}

	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}

	public String getNotificationChannel() {
		return notificationChannel;
	}

	public void setNotificationChannel(String notificationChannel) {
		this.notificationChannel = notificationChannel;
	}

	public String getAlertGeneratedDate() {
		return alertGeneratedDate;
	}

	public void setAlertGeneratedDate(String alertGeneratedDate) {
		this.alertGeneratedDate = alertGeneratedDate;
	}

	public String getAcknowledgedBy() {
		return acknowledgedBy;
	}

	public void setAcknowledgedBy(String acknowledgedBy) {
		this.acknowledgedBy = acknowledgedBy;
	}

	public String getAcknowledgedDate() {
		return acknowledgedDate;
	}

	public void setAcknowledgedDate(String acknowledgedDate) {
		this.acknowledgedDate = acknowledgedDate;
	}

	public String getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(String resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public String getAlertStatus() {
		return alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}

}
