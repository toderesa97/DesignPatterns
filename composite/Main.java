package composite;

public class Main {
       
    public static void main(String[] args) {
        Employee ceo = new Employee("Thomas", "Director", 500000);
        
        Employee jessyEmployee = new Employee("Jessy", "Sales", 30000);
        Employee robertEmployee= new Employee("Robert", "Sales", 30000);
        
        Employee markEmployee = new Employee("Mark", "Delivery", 30000);
        
        jessyEmployee.add(markEmployee);
        robertEmployee.add(markEmployee);
        
        ceo.add(jessyEmployee);
        ceo.add(robertEmployee);
        
        System.out.println(jessyEmployee.search(markEmployee)); // true
        System.out.println(markEmployee.search(ceo));  // false
        System.out.println(ceo.search(ceo));  // true
        System.out.println(ceo.search(markEmployee));  // true
        System.out.println(ceo.search(robertEmployee));  // true
        System.out.println(ceo.search(new Employee("Maria", "Clerk", 25000)));  // false
        
    }
    
}
