package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String dept;
    private float wage;
    private List<Employee> subordinates;

    public Employee(String name, String dept, float wage) {
        this.name = name;
        this.dept = dept;
        this.wage = wage;
        subordinates = new ArrayList<>();
    }
    
    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }
    
    public boolean search (Employee employee) {
        if (this.equals(employee)) {
            return true;
        }
        return subordinates.stream().anyMatch(e -> e.search(employee));
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + wage+" ]");
    }       

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee other = (Employee) obj;
            return name.equals(other.name) && dept.equals(other.dept);
        }
        return false;
    }
}
