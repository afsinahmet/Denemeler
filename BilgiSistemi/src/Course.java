public class Course {
    /*Course Sınıfı Özellikleri :

    Nitelikler : name,code,prefix,note,Teacher
    Metotlar : Course() , addTeacher() , printTeacher()*/

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println("Akademisyen başarıyla eklendi.");

        } else {
            System.out.println("Akademisyen bu dersi veremez.");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin akademisyeni: " + teacher.name);
        } else {
            System.out.println("Derse akademisyen atanmamıştır.");
        }


    }
}
