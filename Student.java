class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 90) {
            System.out.println(name + " Grade: A");
        } else if (marks >= 75) {
            System.out.println(name + " Grade: B");
        } else if (marks >= 60) {
            System.out.println(name + " Grade: C");
        } else {
            System.out.println(name + " Grade: Fail");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class StudentRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Sindhu", 85);
        Student student2 = new Student("Puneeth", 92);

        student1.display();
        student1.calculateGrade();

        student2.display();
        student2.calculateGrade();
    }
}