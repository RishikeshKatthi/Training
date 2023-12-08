package com.sismos.complaints;

import java.util.ArrayList;
import java.util.List;

//Create a collection to store complaints objects. Create a method to save the complaint. 
//this complaint method takes complaint object as input and adds the complaint id to complaint object, and updates the status as open
//after successful save,it should return the complaint id back

//Create other method to getOpenComplaints this method returns all the complaint objects of status open getOpenComplaints method
public class Dao {
	
	private List<Complaint> complaints;
	public Dao() {
		this.complaints = new ArrayList<>();
	}
	public int saveComplaint(Complaint complaint) {
		int complaintId = generateComplaintId();
		complaint.setComplaintId(complaintId);
		complaint.setStatus("Open");
		complaints.add(complaint);
		return complaintId;
	}
	public List<Complaint> getOpenComplaintaa(){
		List<Complaint> openComplaints = new ArrayList<>();
		for(Complaint complaint : complaints) {
			if("Open".equalsIgnoreCase(complaint.getStatus())) {
				openComplaints.add(complaint);
			}
		}
		return openComplaints;
	}
	private int generateComplaintId() {
		return complaints.size() + 1;
	}
}
