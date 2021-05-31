/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi.produktif;

/**
 *
 * @author ilham
 */
public class JayaBaru {

private String size, harga;
 private String merk, warna, jenis, kategori;
 
 
 
 public String getSize() {
  return size;
 }
 
 public void setSize(String size) {
  this.size = size;
 }
 
 public String getHarga() {
  return harga;
 }
 
 public void setHarga(String harga) {
  this.harga = harga;
 }
 
 public String getMerk() {
  return merk;
 }
 
 public void setMerk(String merk) {
  this.merk = merk;
 }
 
 public String getWarna() {
  return warna;
 }
 public void setWarna(String warna) {
  this.warna = warna;
 }
 
 public String getJenis() {
  return jenis;
 }
 
 public void setJenis(String jenis) {
  this.jenis = jenis;
 }
 
 public String getKategori() {
  return kategori;
 }
 
 public void setKategori(String kategori) {
  this.kategori = kategori;
 }
 
 
 public void tampilkanDetail(){
  System.out.println("Size : "  + getSize());
  System.out.println("Harga : " + getHarga());
  System.out.println("Merk : " + getMerk());
  System.out.println("Warna : " + getWarna());
  System.out.println("Jenis : "+ getJenis());
  System.out.println("Kategori : "+ getKategori());
  System.out.println();
 }
 
}