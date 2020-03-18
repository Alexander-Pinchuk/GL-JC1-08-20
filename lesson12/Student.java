package itacademy.lesson12;

public class Student {
    private String name;
    private String specialization;
    private int course;

    public Student(String name, String specialization, int course) {
        this.name = name;
        this.specialization = specialization;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student " +
                "name: '" + name + '\'' +
                ", specialization: '" + specialization + '\'' +
                ", course: " + course + "\n";
    }
}
