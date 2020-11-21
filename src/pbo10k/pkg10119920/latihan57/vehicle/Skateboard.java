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

public class Skateboard extends Vehicle {
    
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("Skateboard");
    }
    
    public double getBoardLength() {
        return myBoardLength;
    }
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}