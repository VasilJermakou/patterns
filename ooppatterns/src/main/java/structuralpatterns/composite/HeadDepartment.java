package structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    /* class fields */
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    /* constructor */
    public HeadDepartment(Integer id, String name){
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    /* getters and setters */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getChildDepartments() {
        return childDepartments;
    }

    public void setChildDepartments(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    /* overriding interface method */
    public void printDepartmentName(){
        childDepartments.stream().forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
