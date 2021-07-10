package structuralpatterns.composite;

public class ApplicationRunner {
    public static void main(String[] args) {

        HeadDepartment headDepartment = new HeadDepartment(1, "Head Department");
        headDepartment.addDepartment(new FinancialDepartment(2, "FinDep"));
        headDepartment.addDepartment(new ITDepartment(3, "ITDep"));

        headDepartment.printDepartmentName();
    }
}
