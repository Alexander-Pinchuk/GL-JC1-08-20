package itacademy.lesson12;

public class Main {

    public static void main(String[] args) {
        University university = new University();
        Student student1 = new Student("Max", "Russian",3);
        Student student2 = new Student("Alex", "Mathematics",5);
        Student student3 = new Student("Maria","Russian",2);
        Student student4 = new Student("Georgiy", "Physics", 2);
        Student student5 = new Student("Alex", "Mathematics",3);

        university.students.add(student1);
        university.students.add(student2);
        university.students.add(student3);
        university.students.add(student4);
        university.students.add(student5);

        System.out.println("Sort students by courses:\n");
        university.byCourse();
        System.out.println("Sort students by specializations:\n");
        university.sortBySpec();
        System.out.println("\nAmount of students of each specialization:\n");
        university.numberOfStudentsOfEachCpec();
        System.out.println("\nFilter by specialization and then sort by course\n");
        university.sortBySpecThenByCource();
        university.thirdCourseExceptPhysics();

    }
}
