/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan60.akatsuki;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Akatsuki
 */
public class Anggota extends Akatsuki{
 
     public Anggota () {
        int pilih = pilihAnggota();
        switch (pilih) {
            case 1:
                this.nama = "Pain Tendo/Uzumaki Nagato";
                this.asalDesa = "Amegakure";
                this.cincin = "零 (Nol, \"Tidak ada\")";
                this.posisiCincin = "Jempol kanan";
                this.partner = "Konan";
                break;
            case 2:
                this.nama = "Konan";
                this.asalDesa = "Amegakure";
                this.cincin = "白 (\"Putih\")";
                this.posisiCincin = "Jari tengah, tangan kanan";
                this.partner = "Pain Tendo/Uzumaki Nagato";
                break;
            case 3:
                this.nama = "Hoshigaki Kisame";
                this.asalDesa = "Kirigakure";
                this.cincin = "南 (\"Selatan\")";
                this.posisiCincin = "Jari manis kiri";
                this.partner = "Uchiha Itachi";
                break;
                
            case 4:
                this.nama = "Zetsu";
                this.asalDesa = "Kusagakure";
                this.cincin = "亥 (\"Kura-kura\")";
                this.posisiCincin = "Kelingking kanan";
                this.partner = "Tobi";
                break;
                
            case 5:
                this.nama = "Tobi";
                this.asalDesa = "Konohagakure";
                this.cincin = "玉 (\"Berlian\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Deidara, Zetsu";
                break;
            case 6:
                this.nama = "Deidara";
                this.asalDesa = "Iwagakure";
                this.cincin = "青(\"Biru/Hijau\")";
                this.posisiCincin = "Telunjuk kanan";
                this.partner = "Sasori";
                break;
            case 7:
                this.nama = "Hidan";
                this.asalDesa = "Yugakure";
                this.cincin = "三 (\"Tiga Tingkatan\")";
                this.posisiCincin = "Telunjuk kiri";
                this.partner = "Kakuzu";
                break;
            case 8:
                this.nama = "Kakuzu";
                this.asalDesa = "Takigakure";
                this.cincin = "北 (\"Utara\")";
                this.posisiCincin = "Jari tengah kiri";
                this.partner = "Hidan";
                break;
            case 9:
                this.nama = "Sasori";
                this.asalDesa = "Sunagakure";
                this.cincin = "玉 (\"Virgo\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Deidara";
                break;
            case 10:
                this.nama = "Uchiha Itachi";
                this.asalDesa = "Konohagakure";
                this.cincin = "朱 (\"Merah Darah\")";
                this.posisiCincin = "Jari manis kanan";
                this.partner = "Hoshigaki Kisame";
                break;
            case 11:
                this.nama = "Orochimaru";
                this.asalDesa = "Konohagakure";
                this.cincin = "空 (\"Langit\")";
                this.posisiCincin = "Jari Kelingking Kiri";
                this.partner = "Sasori";
                break;
            default:
                break;
        }
     }    
    
    @Override
    public int pilihAnggota() {
        return super.pilihAnggota();
    }
    
    public void tampilProfil() {
        System.out.println("\n=============Profil Karakter============");
        System.out.println("Nama \t\t: " +getNama());
        System.out.println("Asal \t\t: " +getAsalDesa());
        System.out.println("Cincin \t\t: " +getCincin());
        System.out.println("Posisi Cincin \t: " +getPosisiCincin());
        System.out.println("Partner \t: " +getPartner());
}
}
