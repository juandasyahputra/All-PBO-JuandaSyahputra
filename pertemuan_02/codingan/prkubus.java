import java.util.Scanner;

public class prkubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi :");
        double Sisi = input.nextDouble();

        double volume = Sisi * Sisi * Sisi;
        System.out.println("Volume Kubus =" + volume);

        input.close();
    }
}
