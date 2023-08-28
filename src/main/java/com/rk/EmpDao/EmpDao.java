package com.rk.EmpDao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rk.Entity.EmpEntity;

@Repository
public interface EmpDao extends JpaRepository<EmpEntity,  Integer> {

	List<EmpEntity> findByName(String name);

	

	
	

}
