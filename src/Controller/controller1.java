package Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import Service.service1;
import model.staff;

public class controller1 {
	void m1() throws ClassNotFoundException, SQLException{
		service1 s = new service1();
		ArrayList<staff> a1 = s.m1();
		System.out.println(a1);
	}
	void insertstaffRecord() throws ClassNotFoundException, SQLException{
		service1 ss = new service1();
		String msg = ss.insertStaffRecord(11, "sham", "78000", "Tester");
		System.out.println(msg);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		controller1 cc = new controller1();
		cc.insertstaffRecord();
		
	}
}
