package Service;

import java.sql.SQLException;

import Dao.dao2;

public class service2 {
	public String insertStaffRecord(int id, String name, String salary, String des) throws ClassNotFoundException,SQLException{
    dao2 dd = new dao2();
    String mssg = dd.insertStaffRecord(id, name, salary, des);
    return mssg;
}
}
