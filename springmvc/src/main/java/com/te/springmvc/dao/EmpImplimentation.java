package com.te.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvc.bean.EmpBean;

@Repository
public class EmpImplimentation implements EmpDao {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public EmpBean authentication(int id, String password) {

		EntityManager manager = factory.createEntityManager();
		EmpBean bean = manager.find(EmpBean.class, id);

		if (bean != null) {
			if (bean.getPassword().equals(password)) {
				System.out.println("login success");
				return bean;
			} else
				System.out.println("invalid inputs");
		} else {
			System.out.println("User not found");
		}
		return null;
	}

	@Override
	public EmpBean getEmployee(int id) {

		EntityManager manager = factory.createEntityManager();
		EmpBean bean = manager.find(EmpBean.class, id);

		return bean;
	}

	@Override
	public boolean deleteEmpData(int id) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmpBean bean = manager.find(EmpBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return false;
	}

	@Override
	public List<EmpBean> getAllEmp() {

		try {

			EntityManager manager = factory.createEntityManager();
			String get = " from EmpBean ";
			Query query = manager.createQuery(get);
			List<EmpBean> data = query.getResultList();
			return data;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}

	@Override
	public boolean addEmp(EmpBean bean) {

		boolean isadded = false;
		try {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			if (bean != null) {
				manager.persist(bean);
				transaction.commit();
				isadded = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			isadded = false;

		}

		return isadded;
	}

	@Override
	public boolean update(EmpBean bean) {

		boolean isupdate = false;
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			EmpBean info = manager.find(EmpBean.class, bean.getId());
			if (info.getName() != null && info.getName() !="") {
				info.setName(bean.getName());
			}
			if (info.getDob() != null) {
				info.setDob(bean.getDob());
			}
			if (info.getPassword() != null && info.getPassword() != "") {
				info.setPassword(bean.getPassword());
			}

			transaction.commit();
			isupdate = true;
		}

		catch (Exception e) {
			isupdate = false;

		}
		return isupdate;
	}
	
	

}
