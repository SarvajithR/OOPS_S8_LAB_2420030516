public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
   
        s.setDetails(101, "A", "Rahul");

        s.showDetails();

        s.grade = "B";
   
        s.name = "Amit";
    
        s.showDetails();
    }
}
