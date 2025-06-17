public class problem2{
    public static void main(String[] args) {
        String[] Student={"BEE","PSOC","CIRCUITS"};
        Teacher s1= new Teacher("m.ramesh","2167fdgh","eee","M.Tech",Student);
         s1.display();
    }
 }
 class Teacher{
    String name;
    String id;
    String[] subjects;
    String dept;
    String qualification;
    Teacher(String mame,String id,String dept,String qualification,String[] subjects){
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.qualification=qualification;
        this.subjects=subjects;
}
    void display(){
        System.out.println("..............");
        System.out.println("Teacher name is:"+name);
        System.out.println("Teacher id is:"+id);
        System.out.println("Teacher department is:"+dept);
        System.out.println("Teacher  qualification is:"+qualification);
        System.out.println("Subjects:");
        for(String subject:subjects){
         System.out.println(subject+".");  
        }
        System.out.println();
        System.out.println("................");
    }
}
