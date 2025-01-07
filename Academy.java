import java.util.ArrayList;
import java.util.Comparator;

public class Academy {

    public static void main(String[] args){
        Academy ac = new Academy();

        //Laver courses
        ArrayList<Course> academyCourses = new ArrayList<>();
        Course web = new Course("Webudvikling");
        academyCourses.add(web);
        Course data = new Course("Databaser");
        academyCourses.add(data);
        Course system = new Course("Systemudvikling");
        academyCourses.add(system);
        Course mat = new Course("Matematik");
        academyCourses.add(mat);


        ArrayList<Student> students = new ArrayList<>();

        Student S1 = new Student("Asger");
        S1.addCourse(mat, 12);
        S1.addCourse(system, 7);
        S1.addCourse(data, 4);
        S1.addCourse(web, 10);
        students.add(S1);

        Student S2 = new Student("Daniel");
        S2.addCourse(mat, 7);
        S2.addCourse(system, 7);
        S2.addCourse(data, 10);
        S2.addCourse(web, 10);
        students.add(S2);

        Student S3 = new Student("William");
        S3.addCourse(mat, -3);
        S3.addCourse(system, 4);
        S3.addCourse(data, 02);
        S3.addCourse(web, 00);
        students.add(S3);

        Student S4 = new Student("Adam");
        S4.addCourse(mat, 7);
        S4.addCourse(system, 10);
        S4.addCourse(data, 7);
        S4.addCourse(web, 10);
        students.add(S4);

        Student S5 = new Student("Gustav");
        S5.addCourse(mat, 12);
        S5.addCourse(system, 12);
        S5.addCourse(data, 12);
        S5.addCourse(web, 12);
        students.add(S5);


    ac.printDiploma(S3);
    }

    public void printDiploma(Student student){

        System.out.println(student.getName());
        for (int i = 0; i < student.getCourses().size(); i++) {
            System.out.println(student.getCourses().get(i)+": "+student.getGrade().get(i));
        }
        System.out.println("Gennemsnit: "+student.getGNS());
    }

    /* //Er simpelthen lost her
    public void printHighest(int amount) {
        ArrayList<Double> allGNS = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            allGNS.add(students.get(i).getGNS());
        }
    }*/


}
