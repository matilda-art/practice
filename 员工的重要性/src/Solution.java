import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: 员工的重要性
 * @description
 * @author: matilda
 * @create: 2020-05-12 14:20
 **/
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                if (e.subordinates.size() == 0) {
                    return e.importance;
                }
                for (int subId : e.subordinates) {
                    e.importance += getImportance(employees, subId);
                }
                return e.importance;
            }
        }
        return 0;
    }
}