package com.rk.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rk.EmpDao.EmpDao;
import com.rk.Entity.EmpEntity;

@Component
public class EmpService {
	
	@Autowired
	EmpDao Dao;

	public void addEmp(EmpEntity e) {
		Dao.save (e);
		
		
	}
//-------------------Get By Id-----------------------------------------------------------------------
	public EmpEntity getEmpByid(int id) {
		EmpEntity e1= null;
		Optional<EmpEntity> e= Dao.findById(id);
		
		if (e.isPresent()) {
			
			e1=e.get();
			
			return e1;
			
		} 
		
		return e1;
	}
	//-----------------------------delete------------------------
	public EmpEntity DeleteEmpByid(int id) {
		Dao.deleteById(id);
		return null;
	}
	
	//--------------------------update--------------------------------------------------------------------------------------
	public void updateEmp(EmpEntity e) {
		Dao.save (e);
		
	}
	//-----------------------------------------SelectAll----------------------------------------------------
	public List<EmpEntity> AllEmpEntity() {
	
		List<EmpEntity> list=Dao.findAll();
		return list;
	}
	//---------------------------------------------------get By Name--------------------------------------
	
		public List<EmpEntity> getEmpByName(String name) {
			
		List<EmpEntity> list =Dao.findByName(name);
		
		return list;
	}
	

}
