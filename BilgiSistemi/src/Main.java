public class Main {
    public static void main(String[] args) {
      /*
        Course Sınıfı Özellikleri :

        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()

        Teacher Sınıfı Özellikleri :

        Nitelikler : name,mpno,branch
        Metotlar : Teacher()

        Student Sınıfı Özellikleri :

        Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
        Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()  */


        Teacher t1 = new Teacher("Ahmet", "532", "TRH");
        Teacher t2=new Teacher("Murat","555","FZK");
        Teacher t3=new Teacher("Kadir","675","KİM");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course kimya = new Course("Kimya", "103", "KİM");


        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1=new Student("İnek Şaban","111","4",tarih,fizik,kimya);
        s1.addBulkExamNote(50,20,40);
        s1.verbalNote(70,50,60);
        s1.isPass();

        Student s2=new Student("Güdük Necmi","222","4",tarih,fizik,kimya);
        s2.addBulkExamNote(100,50,40);
        s2.verbalNote(75,90,60);
        s2.isPass();

        Student s3=new Student("Hayta İsmail","333","4",tarih,fizik,kimya);
        s3.addBulkExamNote(70,30,80);
        s3.verbalNote(50,60,40);
        s3.isPass();
    }
}