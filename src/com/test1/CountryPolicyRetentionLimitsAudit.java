package com.test1;

public class CountryPolicyRetentionLimitsAudit {
	private long limitsAuditId;
	private long limitsId;
	private String auditType;
	private long previousLimitsGB;
	private long updatedLimitsGB;
	private String changeReason;
	private String changedBy;
	private String changedDate;
	private String businessJustification;
	private String auditReferenceNumber;
	private String complianceStatus;

	public CountryPolicyRetentionLimitsAudit() {

	}

	public CountryPolicyRetentionLimitsAudit(long limitsAuditId, long limitsId, String auditType, long previousLimitsGB,
			long updatedLimitsGB, String changeReason, String changedBy, String changedDate,
			String businessJustification, String auditReferenceNumber, String complianceStatus) {
		super();
		this.limitsAuditId = limitsAuditId;
		this.limitsId = limitsId;
		this.auditType = auditType;
		this.previousLimitsGB = previousLimitsGB;
		this.updatedLimitsGB = updatedLimitsGB;
		this.changeReason = changeReason;
		this.changedBy = changedBy;
		this.changedDate = changedDate;
		this.businessJustification = businessJustification;
		this.auditReferenceNumber = auditReferenceNumber;
		this.complianceStatus = complianceStatus;
	}

	public long getLimitsAuditId() {
		return limitsAuditId;
	}

	public void setLimitsAuditId(long limitsAuditId) {
		this.limitsAuditId = limitsAuditId;
	}

	public long getLimitsId() {
		return limitsId;
	}

	public void setLimitsId(long limitsId) {
		this.limitsId = limitsId;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public long getPreviousLimitsGB() {
		return previousLimitsGB;
	}

	public void setPreviousLimitsGB(long previousLimitsGB) {
		this.previousLimitsGB = previousLimitsGB;
	}

	public long getUpdatedLimitsGB() {
		return updatedLimitsGB;
	}

	public void setUpdatedLimitsGB(long updatedLimitsGB) {
		this.updatedLimitsGB = updatedLimitsGB;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getChangedDate() {
		return changedDate;
	}

	public void setChangedDate(String changedDate) {
		this.changedDate = changedDate;
	}

	public String getBusinessJustification() {
		return businessJustification;
	}

	public void setBusinessJustification(String businessJustification) {
		this.businessJustification = businessJustification;
	}

	public String getAuditReferenceNumber() {
		return auditReferenceNumber;
	}

	public void setAuditReferenceNumber(String auditReferenceNumber) {
		this.auditReferenceNumber = auditReferenceNumber;
	}

	public String getComplianceStatus() {
		return complianceStatus;
	}

	public void setComplianceStatus(String complianceStatus) {
		this.complianceStatus = complianceStatus;
	}

}
