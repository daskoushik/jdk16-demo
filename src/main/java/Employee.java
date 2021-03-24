public record Employee(int empId, String name, Department dept) {
   public Employee {
       if(empId<0){
           throw new IllegalArgumentException("empId<0");
       }
   }

   public String combineEmpIdName(){
       return empId + " - "+ name;
   }

}
