package com.ms.functional;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSal()>e2.getSal())
			return 1;
		else if(e1.getSal()<e2.getSal())
			return -1;
		else
			return 0;
	}

}
/*
     e1>e2    +ve
     e1<e2    -ve
     e1=e2    0
*/
