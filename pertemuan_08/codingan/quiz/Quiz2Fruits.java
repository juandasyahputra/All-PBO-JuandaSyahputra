import java.util.Scanner;

class Fruits {
    String warna;

    Fruits(String warna) {
        this.warna = warna;
    }

    void tampilkanWarna() {
        System.out.println("Warna buah : " + warna);
    }
}

class Apel extends Fruits {
    String rasa;

    Apel(String warna, String rasa) {
        super(warna);
        this.rasa = rasa;
    }

    void tampilkanApel() {
        System.out.println("Buah : Apel");
        tampilkanWarna();
        System.out.println("Rasa : " + rasa);
    }
}

class Mangga extends Fruits {
    String rasa;

    Mangga(String warna, String rasa) {
        super(warna);
        this.rasa = rasa;
    }

    void tampilkanMangga() {
        System.out.println("Buah : Mangga");
        tampilkanWarna();
        System.out.println("Rasa : " + rasa);
    }
}

public class Quiz2Fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== DATA BUAH APEL ===");
        System.out.print("Masukkan warna apel: ");
        String warnaApel = input.nextLine();

        System.out.print("Masukkan rasa apel: ");
        String rasaApel = input.nextLine();

        System.out.println("\n=== DATA BUAH MANGGA ===");
        System.out.print("Masukkan warna mangga: ");
        String warnaMangga = input.nextLine();

        System.out.print("Masukkan rasa mangga: ");
        String rasaMangga = input.nextLine();

        Apel apel = new Apel(warnaApel, rasaApel);
        Mangga mangga = new Mangga(warnaMangga, rasaMangga);

        System.out.println("\n=== HASIL DATA APEL ===");
        apel.tampilkanApel();

        System.out.println("\n=== HASIL DATA MANGGA ===");
        mangga.tampilkanMangga();

        input.close();
    }
}
