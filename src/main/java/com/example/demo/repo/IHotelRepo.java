package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;

public interface IHotelRepo {
	
//	public void insertar(Hotel h)

	public List<Hotel> seleccionarHotelInnerJoin();
	public List<Hotel> seleccionarHotelOuterRightJoin();
	public List<Hotel> seleccionarHotelOuterLeftJoin();

	public List<Habitacion> seleccionarHabitacionOuterLeftJoin();
	
	public List<Hotel> seleccionarHotelOuterFullJoin();
	
	public List<Hotel> seleccionarWhereJoin();
	
	
	
}
