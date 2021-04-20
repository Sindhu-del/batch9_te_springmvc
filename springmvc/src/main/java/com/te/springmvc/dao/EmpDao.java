package com.te.springmvc.dao;



import java.util.Date;
import java.util.List;

import com.te.springmvc.bean.EmpBean;


public interface EmpDao {
	
	
	public EmpBean authentication(int id,String password);
	
	public EmpBean getEmployee(int id);
	
	public boolean deleteEmpData(int id);
	public List<EmpBean> getAllEmp();
	
	public boolean addEmp(EmpBean bean);
	public boolean update(EmpBean bean); 
	
	
	

}
