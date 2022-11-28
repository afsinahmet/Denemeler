public class Student {
   /* Student Sınıfı Özellikleri :

    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()  */

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (0 <= note1 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (0 <= note1 && note1 <= 100) {
            this.c2.note = note2;
        }
        if (0 <= note1 && note1 <= 100) {
            this.c3.note = note3;
        }

    }

    void verbalNote(int verbal1, int verbal2, int verbal3) {
        if (0 <= verbal1 && verbal1 <= 100) {
            this.c1.verbalNote = verbal1;
        }
        if (0 <= verbal2 && verbal2 <= 100) {
            this.c2.verbalNote = verbal2;
        }
        if (0 <= verbal3 && verbal3 <= 100) {
            this.c3.verbalNote = verbal3;
        }

    }
    void isPass() {
        calcAverage();
        printNote();
        System.out.println("Ortalama: " + this.avarage);

        if (avarage > 55) {
            System.out.println("Sınıfı geçtiniz");
        } else {
            System.out.println("Sınıfta kaldınız");
        }

    }

    void calcAverage() {
        double c1average=this.c1.note*0.8+this.c1.verbalNote*0.2;
        double c2average=this.c2.note*0*7+this.c2.verbalNote*0.3;
        double c3average=this.c3.note*0.6+this.c3.verbalNote*0.4;
        this.avarage = (c1average + c2average + c3average) / 3;
    }

    void printNote() {
        System.out.println("==================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Tarih notu: " + this.c1.note);
        System.out.println("Fizik notu: " + this.c2.note);
        System.out.println("Kimya notu: " + this.c3.note);
    }
}
