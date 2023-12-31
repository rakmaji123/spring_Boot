package com.rk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.rk.Entity.EmpEntity;
import com.rk.Service.EmpService;

@PropertySource(value="classpath:employee.properties")
@RestController
public class EmpController {
	
	@ Autowired
	EmpService ss;
	
	@Value("${message}")
	private String msd;
	
	@Value("${kohli}")
	private String vk;
	
	@Value("${Rakmaji}")
	private String Rk;
	
	@GetMapping("/empAdd")
	public String addEmp(@RequestBody EmpEntity e) {
		ss.addEmp(e);
		return "add employee sucusessful";
		
		
	}
	//-------------------------------get By id----------------------------------------
	
	@GetMapping("/id/{id}")
	public EmpEntity getEmpByid(@PathVariable int id) {
		
		EmpEntity e=ss.getEmpByid(id);
		System.out.println(msd);
		return e;
		
	}
	//------------------------Get By Delete--------------------------------------------------
	
	
	@DeleteMapping("/id/{id}")
	public String DeleteEmpByid(@PathVariable int id) {
		
		EmpEntity e= ss.DeleteEmpByid(id);
		return "delete successfuly";
}
	//-----------------update-----------------------------------------------------------------
	@PutMapping("/empupdate")
	public String updateEmp(@RequestBody EmpEntity e) {
		ss.updateEmp(e);
		return "update employee sucusessful";
		
	}
	
	//----------------------------------selectAll------------------------------------------
	@GetMapping("/SelectAll")
	public List<EmpEntity> AllEmpEntity(){
		List<EmpEntity> list=ss. AllEmpEntity();
		System.out.println(Rk);
		return list;
	}
	//--------------------------------Get  By name--------------------------------------
	@GetMapping("/getname/name/{name}")
	public List<EmpEntity> GetEmpByName( @PathVariable String name){
		List<EmpEntity> list = ss. getEmpByName(name);
		System.out.println(vk);
		return list;
	}
}
