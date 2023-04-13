package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.dao;
import Dao.dao1;
import model.staff;

public class service1 {
	public ArrayList<staff> m1() throws ClassNotFoundException, SQLException{
		
		dao d = new dao();;
		ArrayList<staff> al = d.m1();
		
		System.out.println("in service :"+al);
		return al;
}
	public String insertStaffRecord(int id, String name,String salary, String des) throws ClassNotFoundException, SQLException{
		dao1 dd = new dao1();
		String mssg= dd.insertStaffRecord(id, name, salary, des);
		return mssg;
	}
}