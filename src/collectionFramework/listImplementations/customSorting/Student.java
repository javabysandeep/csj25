package collectionFramework.listImplementations.customSorting;

public class Student implements Comparable<Student>{
    int studentId;
    String studentName;
    int studentMarks;

    public Student(int studentId, String studentName, int studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentMarks-o.studentMarks;
    }
}
