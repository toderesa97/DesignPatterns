package filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream().filter(p -> p.getGender() == Gender.MALE)
                            .collect(Collectors.toList());
    }
    
}
