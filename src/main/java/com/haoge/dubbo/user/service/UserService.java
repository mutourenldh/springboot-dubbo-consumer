package com.haoge.dubbo.user.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haoge.dubbo.ticket.service.TicketService;

@Service
public class UserService {
	@Reference
	TicketService ticketService;
	public void hello() {
		System.out.println("买到票了:"+ticketService.getTicket());
	}
}
