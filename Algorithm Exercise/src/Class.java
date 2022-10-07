public class Class {
    public String fullName;
    public int age;
    public int GPA;

    public Class() {

    }
    public Class(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Class{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }

    // Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.
    public void sortFullName(Class[] studentList) {
        for (int i = 0; i < studentList.length; i++) {
            for (int j = 0; j < studentList.length; j++) {
                if (studentList[i].getFullName().compareTo(studentList[j].getFullName()) > 0) {
                    Class temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                } else if (studentList[i].getFullName().compareTo(studentList[j].getFullName()) == 0) {
                    if (studentList[i].getAge() > studentList[j].getAge()) {
                        Class temp = studentList[i];
                        studentList[i] = studentList[j];
                        studentList[j] = temp;
                    }
                }
            }
        }
    }

    //Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần.
    public void sortAge(Class[] studentList) {
        for (int i = 0; i < studentList.length; i++) {
            for (int j = 0; j < studentList.length; j++) {
                if (studentList[i].getAge() < studentList[j].getAge()) {
                    Class temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                } else if (studentList[i].getAge() == studentList[j].getAge()) {
                    if (studentList[i].getGPA() > studentList[j].getGPA()) {
                        Class temp = studentList[i];
                        studentList[i] = studentList[j];
                        studentList[j] = temp;
                    }
                }
            }
        }
    }

    //Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi).
    public void sortName(Class[] studentList) {
        for (int i = 0; i < studentList.length; i++) {
            for (int j = 0; j < studentList.length; j++) {
                String name1 = studentList[i].getFullName().substring(studentList[i].getFullName().lastIndexOf(" ")+1);
                String name2 = studentList[j].getFullName().substring(studentList[j].getFullName().lastIndexOf(" ")+1);
                if (name1.compareTo(name2) < 0) {
                    Class temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
    }
}
