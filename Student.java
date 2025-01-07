import java.util.ArrayList;

public class Student {
    String name;

    ArrayList<Course> courses;
    ArrayList<Integer> grades;

    //Konstruktør
    Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }


    public void addCourse(Course course, int grade) {
        if (tjeksGrade(grade)) {
            if(courses.contains(course)){
                System.out.println("Kurset "+course.getCourseName()+" er allerede tilføjet");
        } else { courses.add(course);
                grades.add(grade);

                //System.out.println("Kurset "+course.getCourseName()+" er blevet tilføjet med karakten "+ grade);
            }}
            else {  System.out.println("Ugyldig karakter"); }
        }


    private boolean tjeksGrade(int grade) {
        return grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12;
    }

        public ArrayList<Course> getCourses () {
            return courses;
        }

        public ArrayList<Integer> getGrade(){
        return grades;
        }

        public double getGNS(){
        double result = 0;
        for (int i = 0; i<grades.size(); i++){
            result += grades.get(i);
        }
        return result/grades.size();
        }


        String getName () {
            return name;
        }




    }

