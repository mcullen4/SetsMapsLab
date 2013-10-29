package common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Startup {

    public static void main(String[] args) {
        
        
         //Lab 2
//         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "666-55-5555");
//         Employee e4 = new Employee("Moore", "Fred", "777-55-5555");
//         
//         List employees = new ArrayList();
//         employees.add(e1);
//         employees.add(e2);
//         employees.add(e3);
//         employees.add(e4);
//         
//         System.out.println(employees.size());
//         
//         Employee activeEmployee = (Employee)employees.get(1);
//         
//         System.out.println(activeEmployee.toString());
//         
//         for(int i=0;i<employees.size();i++){
//         Employee e = (Employee)employees.get(i);
//         System.out.println(e.toString());
         
        
        
         //Lab3
//         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "666-55-5555");
//         Employee e4 = new Employee("Moore", "Fred", "777-55-5555");
//         
//         List <Employee> employees = new ArrayList<Employee>();
//         employees.add(e1);
//         employees.add(e2);
//         employees.add(e3);
//         employees.add(e4);
//         
//         System.out.println(employees.size());
//         
//         Employee activeEmployee = employees.get(1);
//         
//         System.out.println(activeEmployee.toString());
//         
//         for(Employee e:employees){
//         System.out.println(e.toString());
//         }
          
         
         
         
         //Lab4
//         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "666-55-5555");
//         Employee e4 = new Employee("Moore", "Fred", "777-55-5555");
//         
//         Set <Employee> employees = new HashSet<Employee>();
//         employees.add(e1);
//         employees.add(e2);
//         employees.add(e3);
//         employees.add(e4);
//         
//         
//         
//         System.out.println(employees.size());
//         List <Employee> employee = new ArrayList<Employee>(employees);
//         
//         
//         Employee activeEmployee = employee.get(1);
//         
//         System.out.println(activeEmployee.toString());
//         
//         for(Employee e:employee){
//         System.out.println(e.toString());
//         }
        
        
        //Lab 5
//         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "666-55-5555");
//         Employee e4 = new Employee("Moore", "Fred", "777-55-5555");
//         
//         Map <String, Employee> employees = new HashMap<String, Employee>();
//         employees.put(e1.getSsn(),e1);
//         employees.put(e2.getSsn(),e2);
//         employees.put(e3.getSsn(),e3);
//         employees.put(e4.getSsn(),e4);
//         
//         
//         
//         System.out.println(employees.size());
//               
//         
//         //Employee activeEmployee = employees.get("666-55-5555");
//         
//         //System.out.println(activeEmployee.toString());
//         
//         
//         for (Map.Entry<String, Employee> e : employees.entrySet()){
//         System.out.println(e.getKey() + ": " + e.getValue());
//         
//         }
//       
//    }
//       //Lab 6 using comparable
//    Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "666-55-5555");
//         Employee e4 = new Employee("Moore", "Fred", "777-55-5555");
//         
//         Map <String, Employee> employees = new TreeMap<String, Employee>();
//         employees.put(e1.getSsn(),e1);
//         employees.put(e2.getSsn(),e2);
//         employees.put(e3.getSsn(),e3);
//         employees.put(e4.getSsn(),e4);
//         
//         
//         
//         System.out.println(employees.size());
//               
//         
//         //Employee activeEmployee = employees.get("666-55-5555");
//         
//         //System.out.println(activeEmployee.toString());
//         
//         
//         for (Map.Entry<String, Employee> e : employees.entrySet()){
//         System.out.println(e.getKey() + ": " + e.getValue());
//         
//         }
//         
//}
         //Lab 6 using comparator
//         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "777-55-5555");
//         Employee e4 = new Employee("Amoore", "Fred", "666-55-5555");
//         
//         Map <String, Employee> employees = new TreeMap<String, Employee>();
//         employees.put(e1.getSsn(),e1);
//         employees.put(e2.getSsn(),e2);
//         employees.put(e3.getSsn(),e3);
//         employees.put(e4.getSsn(),e4);
//         
//         
//         
//         Collection<Employee> employeeCollection = employees.values();
//        
//        List<Employee> sortedList = new ArrayList<Employee>(employeeCollection);
//        
//        Collections.sort(sortedList, new EmployeeByLastName());
//        for(Employee emp : sortedList) {
//            System.out.println(emp);
//         
//}
        
       
         //Lab 7 using comparable and iterator
//         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
//         Employee e2 = new Employee("Doe", "John", "555-55-5555");
//         Employee e3 = new Employee("Jones", "Sue", "777-55-5555");
//         Employee e4 = new Employee("Amoore", "Fred", "666-55-5555");
//         
//         Set<Employee> set = new TreeSet<Employee>();
//         set.add(e1);
//         set.add(e2);
//         set.add(e3);
//         set.add(e4);
//         
//           
//         
//         Iterator<Employee> iterator = set.iterator();
//         while(iterator.hasNext()) {
//         Employee employee = iterator.next();
//         System.out.println(employee);
//         }
         
         //Lab 7 using comparator and iterator
         Employee e1 = new Employee("Smith", "Joe", "555-55-5555");
         Employee e2 = new Employee("Doe", "John", "555-55-5555");
         Employee e3 = new Employee("Jones", "Sue", "777-55-5555");
         Employee e4 = new Employee("Amoore", "Fred", "666-55-5555");
         
         Set<Employee> set = new TreeSet<Employee>();
         set.add(e1);
         set.add(e2);
         set.add(e3);
         set.add(e4);
         
         Set<Employee> newSet = new TreeSet<Employee>(new EmployeeByLastName());
         newSet.addAll(set);
        
           
         
         Iterator<Employee> iterator = newSet.iterator();
         while(iterator.hasNext()) {
         Employee employee = iterator.next();
         System.out.println(employee);
         }
         
   }
    
//        Array <Employee> employeeArray = new Array<Employee>(set.toArray());
//        List<Employee> employeeCollection = new ArrayList<Employee>(set);
//        
//        //List<Employee> sortedList = new ArrayList<Employee>(employeeCollection);
//        
//        Collections.sort(employeeCollection, new EmployeeByLastName());
//        for(Employee emp : employeeCollection) {
//            System.out.println(emp);
         
}
    
        
        
        
        
        
        
        
        
         //        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    

