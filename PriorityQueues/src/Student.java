public class Student implements Comparable<Student> {
    int height, weight, rno;

    Student(int rno, int height, int weight) {
        this.rno = rno;
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Student other) {
        // return other.rno - this.rno; // makes the max heap for rollno.
        // return this.rno - other.rno; // makes the min heap for rollno.
        // return other.height - this.height; // makes max heap for height
        return other.weight - this.weight; // makes min heap for weitght
    }

    public String toString() {
        return "R.no: " + rno + " Height: " + height + " Weight: " + weight;
    }
}
