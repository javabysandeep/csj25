package objectClassDemo;

import java.util.Objects;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Student student = (Student) obj;
        return this.id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
