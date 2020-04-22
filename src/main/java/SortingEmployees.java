import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingEmployees {

    public static List<Employee> getEmployeeAboveAge(List<Employee> employees, int age) {
        List<Employee> overAge = employees.stream()
                .filter(x -> x.getAge() > age)
                .collect(Collectors.toList());
        return overAge;
    }

    public static List<Employee> getEmployeeSortedBy(List<Employee> employees, Comparator<Employee> comparator, boolean decreasing) {
        List<Employee> sortedBy = employees.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        if(decreasing) {
            Collections.reverse(sortedBy);
        }
        return sortedBy;
    }

}
