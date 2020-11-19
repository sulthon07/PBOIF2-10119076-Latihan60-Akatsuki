/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan60.akatsuki;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Akatsuki
 */
public class Akatsuki {
    protected String nama,cincin,posisiCincin,partner,asalDesa;

     public Akatsuki() {
        System.out.println("--------------AKATSUKI--------------");
        System.out.println("Daftar Anggota :");
        System.out.println("1. Pain Tendo/Uzumaki Nagato");
        System.out.println("2. Konan");
        System.out.println("3. Hoshigaki Kisame");
        System.out.println("4. Zetsu");
        System.out.println("5. Tobi");
        System.out.println("6. Deidara");
        System.out.println("7. Hidan");
        System.out.println("8. Kakuzu");
        System.out.println("9. Sasori");
        System.out.println("10. Uchiha Itachi");
        System.out.println("11. Orochimaru");
    }

    public String getNama() {
        return nama;
    }

    public String getCincin() {
        return cincin;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getPartner() {
        return partner;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public int pilihAnggota() {
        System.out.print("\nPilih Karakter : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
