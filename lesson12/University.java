package itacademy.lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    ArrayList<Student> students;

    public University() {
        students = new ArrayList<Student>();
    }

    void byCourse() {
        List<Student> course1 = students.stream().filter(student -> student.getCourse()==1).collect(Collectors.toList());

       if (!course1.isEmpty()) {
           System.out.println("Students of the first course: ");
           printStudents(course1);
           System.out.println("");
       }

        List<Student> course2 = students.stream().filter(student -> student.getCourse()==2).collect(Collectors.toList());
       if(!course2.isEmpty()){
           System.out.println("Students of the second course: ");
           printStudents(course2);
           System.out.println("");
       }

        List<Student> course3 = students.stream().filter(student -> student.getCourse()==3).collect(Collectors.toList());
        if(!course3.isEmpty()) {
            System.out.println("Students of the third course: ");
            printStudents(course3);
            System.out.println("");
        }


        List<Student> course4 = students.stream().filter(student -> student.getCourse()==4).collect(Collectors.toList());
        if(!course4.isEmpty()) {
            System.out.println("Students of the forth course: ");
            printStudents(course4);
            System.out.println("");
        }


        List<Student> course5 = students.stream().filter(student -> student.getCourse()==5).collect(Collectors.toList());
        if(!course5.isEmpty()) {
            System.out.println("Students of the fifth course: ");
            printStudents(course5);
            System.out.println("");
        }

    }

    void sortBySpec(){
        List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(Student::getSpecialization)).
                collect(Collectors.toList());
        printStudents(sortedStudents);
    }

    void numberOfStudentsOfEachCpec(){
        int amountPhysics = (int) students.stream().filter(student -> student.getSpecialization()=="Physics").count();
        System.out.println("Students of Physics specialization: " + amountPhysics);

        int amountMathematics = (int) students.stream().filter(student -> student.getSpecialization() == "Mathematics").count();
        System.out.println("Students of Mathematics specialization: " + amountMathematics);

        int amountOfRussian = (int) students.stream().filter(student -> student.getSpecialization() == "Russian").count();
        System.out.println("Students of Russian specialization: " + amountOfRussian);

    }

    void sortBySpecThenByCource(){
        List<Student> physics = students.stream()
                .sorted(Comparator.comparing(student -> student.getCourse()))
                .filter(student -> student.getSpecialization()=="Physics")
                .collect(Collectors.toList());
        List<Student> mathematics = students.stream()
                .sorted(Comparator.comparing(student -> student.getCourse()))
                .filter(student -> student.getSpecialization()=="Mathematics")
                .collect(Collectors.toList());
        List<Student> russian = students.stream()
                .sorted(Comparator.comparing(student -> student.getCourse()))
                .filter(student -> student.getSpecialization()=="Russian")
                .collect(Collectors.toList());
        printStudents(physics);
        printStudents(mathematics);
        printStudents(russian);
    }

    void thirdCourseExceptPhysics(){
        List<Student> thirdCourseExceptPhysics = students.stream()
                .filter(student -> student.getSpecialization()!="Physics")
                .filter(student -> student.getCourse()==3)
                .collect(Collectors.toList());
        if(!thirdCourseExceptPhysics.isEmpty()){
            System.out.println("\nStudents by third course all specializations except physics:\n");
            printStudents(thirdCourseExceptPhysics);
        }
    }

    void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.print(s);
        }
    }
}
