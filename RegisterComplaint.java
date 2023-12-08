package com.sismos.complaints;

//Extend this class with HTTPServlet and override doPost method to take the register form details from UI 
//and call DAO class saveComplaint. send response to UI as "Complaint registered successfully complaintID id"+complaintId 
//method to save the complaint. Override doGet method to return all the open complaints. Use DAO class getOpenComplaints method and 
//send response to UI
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterComplaint extends jakarta.servlet.http.HttpServlet{

	private static final long serialVersionUID = 1L;

	private Dao dao;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = new Dao();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mailid = request.getParameter("mailid");
		String mobileNumber = request.getParameter("mobileNumber");
		String description = request.getParameter("description");
		
		Complaint complaint = new Complaint(0, name, mailid, mobileNumber, description, null);
		int complaintId = dao.saveComplaint(complaint);
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.write("Complaint registered successfully. Complaint ID: " +complaintId);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.write("openComplaints");
	}

}
