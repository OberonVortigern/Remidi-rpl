/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi.produktif;

import java.util.Scanner;

/**
 *
 * @author ilham
 */
public class RemidiProduktif {

    /**
     * @param args the command line arguments
     */
    public static void main(String args []){
  
  Pilihan pilihan = new Pilihan();
  pilihan.setSize("[25] [26] [27] [28] [29] [30] [31] [32] [33] [34] ");
  pilihan.setHarga("[100000] [200000] [300000] [400000] [500000] [600000] [700000] [800000] ");
  pilihan.setMerk("[910] [ADIDAS] [NIKE] [SKECHERS] [PUMA] [REEBOK] [VANS] [CONVERSE] [FILA]");
  pilihan.setWarna("[Hitam] [Putih] [Emas] [Perak] [Jingga] [Hijau] [Kuning] [Biru] [Merah]");
  pilihan.setJenis("[Pria] [Wanita]");
  pilihan.setKategori("[Olahraga] [Lari] [Santai] [Kantoran]");
  pilihan.tampilkanDetail();
  
  
  Scanner a = new Scanner(System.in); 
  Scanner b = new Scanner(System.in); 
  Scanner c = new Scanner(System.in); 
  Scanner d = new Scanner(System.in); 
  Scanner e = new Scanner(System.in); 
  Scanner f = new Scanner(System.in);
  Scanner l = new Scanner(System.in);
  int A, B, pembayaran;
  String C, D, E, F;
  
  System.out.println();
  
  System.out.print("Masukan Size: ");
    A = a.nextInt();
    
  System.out.print("Masukan Merk: ");
    C  = c.nextLine();
  
  System.out.print("Masukan Warna: ");
    D  = d.nextLine();
  
  System.out.print("Masukan Jenis: ");
    E  = e.nextLine();
  
  System.out.print("Masukan Kategori: ");
    F  = f.nextLine();
  
  System.out.print("Masukan Harga: ");
    B = b.nextInt();
    
    System.out.println();
    
    if(B == 100000){
        System.out.print("SIlahkan Membayar 100.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 100000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 100000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 100000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 200000){
        System.out.print("SIlahkan Membayar 200.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 200000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 200000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 200000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 300000){
        System.out.print("SIlahkan Membayar 300.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 300000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 300000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 300000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 400000){
        System.out.print("SIlahkan Membayar 400.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 400000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 400000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 400000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 500000){
        System.out.print("SIlahkan Membayar 500.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 500000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 500000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 500000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 600000){
        System.out.print("SIlahkan Membayar 600.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 600000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 600000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 600000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 700000){
        System.out.print("SIlahkan Membayar 700.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 700000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 700000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 700000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    if(B == 800000){
        System.out.print("SIlahkan Membayar 800.000 dengan memasukkan Pembayaran :");
         pembayaran = l.nextInt();
         if(pembayaran == 800000)
            System.out.println("Uang Pas, Terima Kasih Telah Berbelanja");
            
         if(pembayaran < 800000)
             System.out.println("Uang Kurang, Silahkan Mengecek Kembali Pembayaran Anda");
         if(pembayaran > 800000)
             System.out.println("Uang Lebih, Terima Kasih Telah Berbelanja");
             
    }
    
    
 }
    
}