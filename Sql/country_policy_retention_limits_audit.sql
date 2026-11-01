create table if not exists country_policy_retention_limits_audit(
limits_audit_id bigint not null,
limits_id bigint null,
audit_type varchar(255) null,
previous_limits_gb bigint null,
updated_limits_gb bigint null,
change_reason varchar(255) null,
changed_by varchar(255) null,
changed_date varchar(255) null,
business_justification varchar(255) null,
audit_reference_number varchar(255) null,
compliance_status varchar(255) null,
constraint country_policy_retention_limits_audit_pk primary key(limits_audit_id));