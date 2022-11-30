public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run() {
        if (whoStart()) {
            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("=====YENİ ROUND======");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }

        } else {
            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("=====YENİ ROUND======");
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }

        }


    }

    boolean checkWeight() {
        return (this.f1.weight >= 0 && this.f1.weight <= 100) && (this.f2.weight >= 0 && this.f2.weight <= 100);

    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("Maçı kazanan: " + f1.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("--------");
        System.out.println(this.f1.name + " kalan can: " + this.f1.health);
        System.out.println(this.f2.name + " kalan can: " + this.f2.health);
    }

    boolean whoStart() {
        double randomValue = Math.random() * 100;
        if (randomValue <= 50) {
            System.out.println("İlk vuruşu " + this.f1.name + " yapıyor.");
            return true;
        }
        System.out.println("İlk vuruşu " + this.f2.name + " yapıyor.");
        return false;
    }
}

