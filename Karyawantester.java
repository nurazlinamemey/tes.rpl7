//Driver Class

import java.util.Scanner;

public class Karyawantester {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("input nama karyawan");
      String nama = input.nextLine();
      System.out.println("Inputan unit karyawan");
      String unit = input.nextLine();
      System.out.println("Input alamt karyawan");
      String alamat = input.nextLine();
      System.out.println("Inputan ID karyawan");
      int id = input.nextInt();
      
      Karyawann keyza = new Karyawann(234,"keyza","BK","tulungagung");

        //object
        //Class object = new Constructor
        Karyawann a = new Karyawann(1, "pandu", "TU", "BANYUWANGI");
        Karyawann b = new Karyawann(2, "messy", "BK", "MALANG");
        Karyawann c = new Karyawann(3, "vira", "SARPRA", "SURABAYA");
        Karyawann d = new Karyawann(4, "donita", "KUIKULUM", "JOGJA");
        Karyawann e = new Karyawann(5, "april", "KESISWAAN", "PALU");

        
        a.print();
        b.print();
        c.print();
        d.print();
        e.print();


    }
}
