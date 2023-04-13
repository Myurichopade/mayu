package Controller;

import java.sql.SQLException;

import Dao.dao2;
import Service.service2;

public class controller2 {
void insertStaffRecord() throws ClassNotFoundException,SQLException{
	    service2 ss = new service2();
	    String mssg = ss.insertStaffRecord(18, "sahil", "30000","tester");
	    System.out.println(mssg);
	}
	    
	    public static void main(String[] args) throws ClassNotFoundException, SQLException{
	    controller2 cc = new controller2();
	    cc.insertStaffRecord();
}
}
