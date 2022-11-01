package collectionFramework.setImplementationsRevision;

public class Student/* implements  Comparable<Student>*/{
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

   /* @Override
    public int compareTo(Student student) {
//        return this.id- student.id;
        return this.name.compareTo(student.name);
    }*/
}
