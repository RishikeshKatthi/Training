package com.sismos.complaints;

//create 6 fields complaintId,name,mailid, mobileNumber,description, status. implement encapsulation principles
public class Complaint {
 private int complaintId;
 private String name;
 private String mailid;
 private String mobileNumber;
 private String description;
 private String status;
 
 public Complaint(int complaintId, String name, String mailid, String mobileNumber, String description, String status) {
	 this.complaintId = complaintId;
	 this.name = name;
	 this.mailid = mailid;
	 this.mobileNumber = mobileNumber;
	 this.description = description;
	 this.status = status;
 }
 public int getComplaintId() {
	 return complaintId;
 }
 public String getName() {
	 return name;
 }
 public String getMailid() {
	 return mailid;
 }
 public String getMobileNumber() {
	 return mobileNumber;
 }
 public String getDescription() {
	 return description;
 }
 public String getStatus() {
	 return status;
 }
 public void setComplaintId(int complaintId) {
	 this.complaintId = complaintId;
 }
 public void setName(String name) {
	 this.name = name;
 }
 public void setMailid(String mailid) {
	 this.mailid = mailid;
 }
 public void setMobileNumber(String mobileNumber) {
	 this.mobileNumber = mobileNumber;
 }
 public void setDescription(String description) {
	 this.description = description;
 }
 public void setStatus(String status) {
	 this.status = status;
 }
}
