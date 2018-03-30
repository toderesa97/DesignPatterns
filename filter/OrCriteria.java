package filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private final Criteria criteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria; 
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        otherCriteriaItems.stream().filter((person) -> (!firstCriteriaItems.contains(person))).forEachOrdered((person) -> {
            firstCriteriaItems.add(person);
        });	
        return firstCriteriaItems;
    }
}
