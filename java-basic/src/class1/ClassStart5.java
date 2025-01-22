package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 객체 or 인스턴스
        student1.name = "학생1"; // 객체에 값을 대입, .(dot)은 객체에 접근하는 키워드
        student1.age = 15;
        student1.grade = 99;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

//        Student[] students = new Student[]{student1, student2}; // 배열 선언
        Student[] students = {student1, student2}; // 배열 선언 최적화

        // for문 적용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        // for-each문 적용
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
