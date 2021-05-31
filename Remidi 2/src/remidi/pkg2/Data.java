/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi.pkg2;

import java.io.PrintStream;

/**
 *
 * @author ilham
 */

public class Data {
    public static void main(String[] args){
        Data d=new Data();
        d.nama= ("sejahtera");
        d.tanggal= ("12.12.2020");
        d.jumlah= ("2");
          d.harga= ("50000");
        d.total= ("100.000");
      
        
      
       
    System.out.println("Nama kasir = "+d.nama);
    System.out.println("tanggal = "+d.tanggal);
    System.out.println("harga barang = "+d.harga);
    System.out.println("Jumlah Barang = "+d.jumlah);
    System.out.println("total belanja = "+d.total);
    
   
    }
    private String nama;
    private String tanggal;

    private String jumlah;
    private String total;
    private String harga;

    

    
    }

   
    
  
