package com.pluriel.pms.booking.services.impls;

import org.springframework.stereotype.Service;

import com.pluriel.pms.booking.services.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Override
	public void helloWorld() {
		System.out.println("HelloWorld From Booking Service");
	}

}
