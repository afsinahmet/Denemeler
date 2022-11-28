public class Teacher {
    /*Teacher Sınıfı Özellikleri :

    Nitelikler : name,mpno,branch
    Metotlar : Teacher()
*/

    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }

    void print(){
        System.out.println("İsim: "+this.name);
        System.out.println("Tel: "+this.mpno);
        System.out.println("Bölüm: "+this.branch);
    }
}
