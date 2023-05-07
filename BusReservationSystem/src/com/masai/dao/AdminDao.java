package com.masai.dao;

import com.masai.bean.Bus;

public interface AdminDao {
public final String username = "Admin";
	
<<<<<<< HEAD
	public final String password = "1234";
=======
	public final String password = "12345";
>>>>>>> f19039f501b165c5e7da55a9f7a2873b29d78386

	public String adminLogin(String username, String password);

	public String addBus(int busNo, String bName, String routeFrom, String routeTo, String bType, String arrival, String departure,
			int totalSeats, int availSeats, int fare);
	
	public String addBus(Bus bus);
	
	public String updateStatus(int cusId);
	
<<<<<<< HEAD
=======
	public void viewAllTickets();
>>>>>>> f19039f501b165c5e7da55a9f7a2873b29d78386

}
