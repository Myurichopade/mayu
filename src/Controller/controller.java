package Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.ws.Service;

import Service.service;
import model.staff;

public class controller {
	void m1() throws ClassNotFoundException, SQLException{
		service s = new service();
		ArrayList<staff> a1 = s.m1();
		for(staff staff : a1) {
			System.out.println(staff);
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		controller cc= new controller();
		cc.m1();
	}
		
	}