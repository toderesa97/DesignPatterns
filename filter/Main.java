package filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        
        people.add(new Person("A", Gender.MALE, MaritalStatus.DIVORCED));
        people.add(new Person("B", Gender.FEMALE, MaritalStatus.SINGLE));
        people.add(new Person("C", Gender.MALE, MaritalStatus.WIDOWED));
        people.add(new Person("D", Gender.MALE, MaritalStatus.DIVORCED));
        people.add(new Person("E", Gender.FEMALE, MaritalStatus.DIVORCED));
        people.add(new Person("F", Gender.MALE, MaritalStatus.MARRIED));
        people.add(new Person("G", Gender.FEMALE, MaritalStatus.DIVORCED));
        people.add(new Person("H", Gender.FEMALE, MaritalStatus.MARRIED));
        people.add(new Person("I", Gender.MALE, MaritalStatus.SINGLE));
        people.add(new Person("J", Gender.MALE, MaritalStatus.MARRIED));
        people.add(new Person("K", Gender.FEMALE, MaritalStatus.WIDOWED));
        
        Criteria singleFemale = new AndCriteria(new CriteriaSingle(), new CriteriaFemale());        
        Criteria singleMale = new AndCriteria(new CriteriaSingle(), new CriteriaMale());
        
        Criteria singleFemale_or_singleMale = new OrCriteria(singleFemale, singleMale);
        System.out.println(singleFemale_or_singleMale.meetCriteria(people));
        
    }
}
