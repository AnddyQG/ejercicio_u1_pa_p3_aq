package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IHotelService;

@SpringBootApplication
public class Pa2U3P4JrAqApplication implements CommandLineRunner{

	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inner Join");
		this.hotelService.buscarHotelInnerJoin().stream().forEach(System.out::println);
		System.out.println(" RIGHT JOIN");
		this.hotelService.buscarHotelOuterRightJoin().stream().forEach(System.out::println);
		System.out.println("LEFTT JOIN");
		this.hotelService.buscarHotelOuterLeftJoin().stream().forEach(System.out::println);
		System.out.println("LEFT JOIN HABITACIONES ");
		this.hotelService.buscarHabitacionOuterLeftJoin().stream().forEach(System.out::println);
		System.out.println("FULL JOIN");
		this.hotelService.buscarHotelOuterFullJoin().stream().forEach(a->{
			
			if(a == null) {
				System.out.println("No exitste aun un hotel");
			}else {
				System.out.println(a.getNombre());
			}
			
		});
		
		
		System.out.println("WHERE JOIN");
		this.hotelService.buscarWhereJoin().stream().forEach(System.out::println);
		
		
	}

}
