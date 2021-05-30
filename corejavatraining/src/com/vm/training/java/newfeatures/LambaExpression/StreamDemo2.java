package com.vm.training.java.newfeatures.LambaExpression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1,"asri","cse",21,260000));
		e.add(new Employee(1,"asritha","cse",22,230000));
		e.add(new Employee(1,"mouni","ece",22,580000));
		e.add(new Employee(1,"pallavi","mech",24,79899));
		e.add(new Employee(1,"pallavi","mech",24,79899));
		e.add(new Employee(1,"sree","cse",24,780000));
		e.forEach(System.out::println);
		
		System.out.println("count of employees");
		long employeecount =e.stream().count();
		System.out.println("total employees " + employeecount);
		e.stream().filter(s->s.getDept().equalsIgnoreCase("cse")).forEach(s->System.out.println(s));
		e.stream().filter(s1->s1.getName().startsWith("a")).forEach(s->System.out.println(s));
		long empabove50 = e.stream().filter(s1->s1.getSalary()>50000).count();
		System.out.println(empabove50);
		e.stream().map(m->m.getSalary()*0.20+m.getSalary()+" "+m.getName().length()).forEach(s->System.out.println(s));
		
		
		List <Employee> emp = e.stream().sorted((o1,o2)->
		{
			return o1.getName().compareTo(o2.getName());
			}).collect(Collectors.toList());
		System.out.println("sorting by name");
		emp.forEach(System.out::println);
		System.out.println("sorting by salary");
		emp.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		System.out.println("sorting by salary reverse");
		emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("distinct values");
		e.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("total salary of hr");
		long s1=e.stream().filter(s->s.getDept().equals("hr")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("salary of hr "+ s1);
      List<Employee> uniqueEmp =e.stream().distinct().collect(Collectors.toList());
      uniqueEmp.forEach(System.out::println);
      
      long skip = 3;
      e.stream().skip(skip).forEach(System.out::println);
      List<Employee> emp1 = Arrays.asList();
      emp1.stream().limit(3).forEach(System.out::println);
      
  

	System.out.println("distinct values");
	e.stream().limit(1).collect(Collectors.toList()).forEach(System.out::println);
      

		

	}

	
	}
