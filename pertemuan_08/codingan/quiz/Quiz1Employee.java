import java.util.Scanner;

class Employee {
    String nama;
    long salary;

    Employee(String nama, long salary) {
        this.nama = nama;
        this.salary = salary;
    }

    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : Rp" + salary);
    }
}

class Lecturer extends Employee {
    long tunjangan;

    Lecturer(String nama, long salary, long tunjangan) {
        super(nama, salary);
        this.tunjangan = tunjangan;
    }

    void tampilkanLecturer() {
        tampilkanData();
        System.out.println("Tunjangan : Rp" + tunjangan);
        System.out.println("Total Gaji : Rp" + (salary + tunjangan));
    }
}

class Admin extends Employee {
    long bonus;

    Admin(String nama, long salary, long bonus) {
        super(nama, salary);
        this.bonus = bonus;
    }

    void tampilkanAdmin() {
        tampilkanData();
        System.out.println("Bonus : Rp" + bonus);
        System.out.println("Total Gaji : Rp" + (salary + bonus));
    }
}

public class Quiz1Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== DATA LECTURER ===");
        System.out.print("Masukkan nama dosen: ");
        String namaDosen = input.nextLine();

        System.out.print("Masukkan gaji: Rp");
        long gajiDosen = input.nextLong();

        System.out.print("Masukkan tunjangan: Rp");
        long tunjangan = input.nextLong();
        input.nextLine();

        System.out.println("\n=== DATA ADMIN ===");
        System.out.print("Masukkan nama admin: ");
        String namaAdmin = input.nextLine();

        System.out.print("Masukkan gaji: Rp");
        long gajiAdmin = input.nextLong();

        System.out.print("Masukkan bonus: Rp");
        long bonus = input.nextLong();

        Lecturer dosen = new Lecturer(
                namaDosen, gajiDosen, tunjangan);
        Admin admin = new Admin(
                namaAdmin, gajiAdmin, bonus);

        System.out.println("\n=== HASIL DATA DOSEN ===");
        dosen.tampilkanLecturer();

        System.out.println("\n=== HASIL DATA ADMIN ===");
        admin.tampilkanAdmin();

        input.close();
    }
}
