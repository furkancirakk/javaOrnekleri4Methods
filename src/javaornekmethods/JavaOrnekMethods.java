/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekmethods;

import java.util.Arrays;

/**
 *
 * @author zajigalka
 */
public class JavaOrnekMethods {

    /**
     * @param args the command line arguments
     */
    public static int sayi1 = 100, sayi2 = 80;
    public static void tumIslemler(){
        toplama();
        cikarma();
        bolme();
        carpma();
    }
    public static void toplama(){
        System.out.println("Toplama işlemi sonucunuz: " + (sayi1+sayi2));
    }
    public static void cikarma(){
        System.out.println("Çıkarma işlemi sonucunuz: " + (sayi1-sayi2));
    }
    public static void bolme(){
        System.out.println("Bölme işlemi sonucunuz: " + (sayi1/sayi2));
    }
    public static void carpma(){
        System.out.println("Çarpma işlemi sonucunuz: " + (sayi1*sayi2));
    }
    public static void ulkeler(){
        String [] ulke = {"Türkiye", "Almanya", "İspanya"};
        System.out.println(Arrays.toString(ulke));
        System.out.println(ulke.length + " ülke vardır.");
    }
    public static void sehirler(){
        String [] sehir = {"İstanbul", "Antalya", "İzmir"};
        System.out.println(Arrays.toString(sehir));
        System.out.println(sehir.length + " şehir vardır.");
    }
    public static void ilceler(){
        String [] ilce = {"Beşiktaş", "Kavacık", "Kadıköy"};
        System.out.println(Arrays.toString(ilce));
        System.out.println(ilce.length + " ilçe vardır.");
    }
    public static void main(String[] args) {
        ulkeler();
        sehirler();
        ilceler();
        
        
    }
    
}
