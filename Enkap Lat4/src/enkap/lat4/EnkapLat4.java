/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkap.lat4;

/**
 *
 * @author ilham
 */
public class EnkapLat4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        
        Bus Bus = new Bus(5);
        
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();
        
     
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        
       
        Bus.addPenumpang(1);//tambah 1 penumpang
        Bus.cetakpenumpang();
        
     
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        
     
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
    }
    
}