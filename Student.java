public class Student {
    static int num = 0;
    int rollNo;

    public static void main(String args[]){

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("num:" + Student.num);

        Student.num += 1;
        System.out.println("num:" + Student.num);

        System.out.println("s1.num:" + s1.num);
        System.out.println("s1.num:" + s2.num);

        // System.out.println("rollNo:" + Student.rollNo);
    }
    
}
