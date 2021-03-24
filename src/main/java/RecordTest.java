public class RecordTest {

    public static void main(String[] args) {
        Employee e = new Employee(20, "TechRecipes", new Department("dept"));
        System.out.println(e);
        System.out.println(e.empId());
        System.out.println(e.name());
        System.out.println(e.combineEmpIdName());
    }
}
