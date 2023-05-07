package com.masai.usecases;

import com.masai.bean.Customer;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;

public class ViewTicketusecase {
public static void viewTicket(Customer customer) {
		
		CustomerDao dao = new CustomerDaoImpl();
		
		dao.viewTicket(customer.getCusId());
	}

}
