package com.samar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samar.Entity.Emp;
import com.samar.Repo.EmployeeRepo;

@RestController
public class EmpController {

	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/save")
	public Emp saveEmp(@RequestBody Emp emp) {
		
		double t=0.0;
		double d=0.0;
		double p=0.0;
		double g=0.0;
		double n=0.0;
		
		double sal=emp.getEsal();
		
		if(sal<30000) {
			t=sal*0.07;
			d=sal*0.09;
			p=sal*0.15;
		}
		if(sal>=30000 && sal<50000) {
			t=sal*0.12;
			d=sal*0.13;
			p=sal*0.22;
		}if(sal>=50000) {
			t=sal*0.17;
			d=sal*0.19;
			p=sal*0.25;
		}
		emp.setTa(t);
		emp.setDa(d);
		emp.setPf(p);
		
		g=sal+t+d;
		emp.setGrass(g);
		
		n=g-p;
		emp.setNet(n);
		
		return empRepo.save(emp);
		
	}
	@DeleteMapping("/delete/{eid}")
	public void deleteEmp(@PathVariable Integer eid) {
		
		empRepo.deleteById(eid);
	}
	@GetMapping("/get/{eid}")
	public Emp getEmp(@PathVariable Integer eid) {
		return empRepo.findById(eid).get();
		
	}
	@GetMapping("/getAll")
	public List<Emp> getAllEmp(){
		List<Emp> l=empRepo.findAll();
		return l;
		
	}
	@PutMapping("/update/{eid}")
	public Emp updateEmp(@RequestBody Emp e,@PathVariable Integer eid) {
		Emp ee=empRepo.findById(eid).get();
		
		ee.setEname(e.getEname());
		ee.setEsal(e.getEsal());
		ee.setDesg(e.getDesg());
		ee.setCname(e.getCname());
		
		double t=0.0;
		double d=0.0;
		double p=0.0;
		double g=0.0;
		double n=0.0;
		
		double sal=ee.getEsal();
		
		if(sal<30000) {
			t=sal*0.07;
			d=sal*0.09;
			p=sal*0.15;
		}
		if(sal>=30000 && sal<50000) {
			t=sal*0.12;
			d=sal*0.13;
			p=sal*0.22;
		}if(sal>=50000) {
			t=sal*0.17;
			d=sal*0.19;
			p=sal*0.25;
		}
		ee.setTa(t);
		ee.setDa(d);
		ee.setPf(p);
		
		g=sal+t+d;
		ee.setGrass(g);
		
		n=g-p;
		ee.setNet(n);
		
		return empRepo.save(ee);
		
	}
}
