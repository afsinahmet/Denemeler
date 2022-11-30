public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter("MARC", 15, 100, 90, 45);
        Fighter alex = new Fighter("ALEX", 10, 95, 100, 60);

        Match m=new Match(marc,alex,90,100);
        m.run();
    }
}