package com.infinite.JsfExamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable {

	public List<Employ> showEmploy(){
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "sindhu", "java", "Developer", 87957.99));
		employList.add(new Employ(2, "Hari", "J2EE", "Expert", 56757.59));
		employList.add(new Employ(3, "Sai", "Mysql", "Developer", 77957.96));
		employList.add(new Employ(4, "Manu", "Angular", "Developer", 66657.99));
		employList.add(new Employ(5, "Krish", "React", "programmer", 47957.99));
        return employList;
	}
}
