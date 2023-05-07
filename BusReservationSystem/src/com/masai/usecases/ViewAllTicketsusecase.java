package com.masai.usecases;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class ViewAllTicketsusecase {
public static void viewAllTicket() {
		
		AdminDao dao = new AdminDaoImpl();
<<<<<<< HEAD
		((AdminDaoImpl) dao).viewAllTickets();
=======
		dao.viewAllTickets();
>>>>>>> f19039f501b165c5e7da55a9f7a2873b29d78386
	}

}
