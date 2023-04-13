package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.dao;
import model.staff;

public class service {
	public ArrayList<staff> m1() throws ClassNotFoundException, SQLException{
		
		dao d = new dao();;
		ArrayList<staff> al = d.m1();
		
		System.out.println("in service :"+al);
		return al;
	}

}
