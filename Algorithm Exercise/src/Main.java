public class Main {
    public static void main(String[] args) {
        Class student = new Class();
        Class[] studentList = new Class[5];
        studentList[0] = new Class("Nguyễn Quốc Tuấn", 20,  1);
        studentList[1] = new Class("Ngô Anh Duy", 18,  2);
        studentList[2] = new Class("Nguyễn Thị Oanh Oanh", 20,  3);
        studentList[3] = new Class("Lê Thùy Linh", 21,  4);
        studentList[4] = new Class("Đỗ Vi Anh", 19,  3);

        student.sortFullName(studentList);
        System.out.println("Họ và tên sau khi được sắp xếp");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Tên: " + studentList[i].getFullName() + ", " + "tuổi: " + studentList[i].getAge());
        }

        student.sortAge(studentList);
        System.out.println("Tuổi sau khi được sắp xếp");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Tuổi: " + studentList[i].getAge() + ", " + "GPA: " + studentList[i].getGPA());
        }

        student.sortName(studentList);
        System.out.println("Tên sau khi được sắp xếp");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Tên: " + studentList[i].getFullName());
        }
    }
}
