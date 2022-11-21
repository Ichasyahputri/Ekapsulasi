/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ekapsulasi_icha;

/**
 *
 * @author Icha Syahputri
 */
public class Ekapsulasi_icha {

public static void main(String[] args) {
                Persegi P = new Persegi();
        P.setPanjang(7);    
        P.setLebar(6);
        System.out.println("Program persegi panjang");
        System.out.println("Tugas Fahmi Arifin");
        System.out.println("Panjang: " +P.getPanjang());
        System.out.println("Lebar: " +P.getLebar());
        System.out.print("Luas persegi: " +P.getLuas());
}}