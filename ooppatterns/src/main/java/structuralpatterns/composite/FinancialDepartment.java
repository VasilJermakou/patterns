package structuralpatterns.composite;

public class FinancialDepartment implements Department{

    /* class fields */
    private Integer id;
    private String name;

    /* constructor */
    public FinancialDepartment(Integer id, String name){
        this.id = id;
        this.name = name;
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

    /* overriding interface method */
    public void printDepartmentName(){
        System.out.println(getClass().getSimpleName());
    }


}
