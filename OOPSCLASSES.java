 class Student {
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPSCLASSES{
    public static void main(String args[]){
    Student s1= new Student();
    s1.name="Anirudh R";
    s1.age=23;

    Student s2=new Student();
    s2.name="Prady";
    s2.age=70;

    s1.printinfo();
    s2.printinfo();
    }
}