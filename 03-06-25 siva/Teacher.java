public class main{
    public static void main(String []args){
        Teacher t1=new Teacher("sarada","EEE",new String[]{"machines","bee"});
        t1.details();
    }
}
public class Teacher{
    String name="sarada";
    String[]subjects={"machines","bee"};
    String dept="EEE";
    String contactNo="8555078144";
    }
    Teacher(String name, String[]subjects, String dept, String contactNo){
        this.name=name;
        this.subject=subject;
        this.dept=dept;
        this.contactNo;
        void details(){
            System.out.println("____");
            System.out.println("Teacher name:"+name);
            System.out.println("Teacher contact:"+contact);
            System.out.println("department:"+dept);
            System.out.println("Subjects");
            for(String subject:subjects){
            System.out.print(subject+" ,");
        }
        System.out.println();
        System.out.println("___________");
    }
    }
}