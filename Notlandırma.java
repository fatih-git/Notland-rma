/**
 * @author fatih-git
 * */

public class Notlandırma {

    public static void main(String[] args) {

        Course mat=new Course("Matematik", "MAT101", "MAT");
        Course fizik=new Course("Fizik", "FZK101", "FZK");
        Course kimya=new Course("Kimya", "KMY101", "KMY");

        Teacher t1=new Teacher("Mahmut Hoca", "0000", "MAT");
        Teacher t2=new Teacher("Fatma Ayşe", "1111", "FZK");
        Teacher t3=new Teacher("Ali Veli", "2222", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1=new Student("Şaban", 4, "3333", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2=new Student("Güdük", 4, "4444", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3=new Student("Hayta", 4, "5555", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();


    }

}
