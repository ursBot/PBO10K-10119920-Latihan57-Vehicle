/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class Vehicle {
    
    private String myBrand;
    private String myModel;
    
    public Vehicle() {
        System.out.print("");
    }
    
    public String getBrand() {
        return myBrand;
    }
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    
    public String getModel() {
        return myModel;
    }
    public void setModel(String model) {
        this.myModel = model;
    }
}
