/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatakeluarga;

/**
 *
 * @author Dinar F V M
 */
public class KelasBiodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiodataKeluarga keluarga = new BiodataKeluarga();
        keluarga.setNamaAyah("Lukky Arjanu");
        keluarga.setNamaIbu("Sunarsih");
        keluarga.setNamaSaudara("Danar Fitra Varian Mushin");
        keluarga.setNamaSaya("Dinar Fitri Vania Muti");
        keluarga.setAlamat("Perum. Bumi Intan Permain blok I no. 6");
        keluarga.setTempatLahir("Surabaya");
        keluarga.setTanggalLahir("14 Desember 2002");
        keluarga.setHobi("Menari");
        keluarga.setCita2("Progammer");
        keluarga.setNotelepon("0318054555");

        System.out.println("Nama Ayah : " + keluarga.getNamaAyah());
        System.out.println("Nama Ibu : " + keluarga.getNamaIbu());
        System.out.println("Nama Saudara : " + keluarga.getNamaSaudara());
        System.out.println("Nama Saya : " + keluarga.getNamaSaya());
        System.out.println("Alamat : " + keluarga.getAlamat());
        System.out.println("Tempat Lahir : " + keluarga.getTempatLahir());
        System.out.println("Tanggal Lahir : " + keluarga.getTanggalLahir());
        System.out.println("Hobi : " + keluarga.getHobi());
        System.out.println("Cita-Cita : " + keluarga.getCita2());
        System.out.println("No. Telepon : " + keluarga.getNotelepon());

    }

}
