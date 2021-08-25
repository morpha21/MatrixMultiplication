/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matriz;

import entities.Matrix;
import java.util.Scanner;

/**
 *
 * @author morpha
 */
public class Matricial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pirmo = 3;
        int nois = pirmo*21;
        
        System.out.println("vaisifudÊ");
        
        System.out.println("check out this cool number: " + nois);
        System.out.println("");
        
        
        System.out.println("A rows:");
        int row = sc.nextInt();
        System.out.println("A columns:");
        int col = sc.nextInt();
        Matrix A = new Matrix(row, col);
        A.make();
        System.out.println("");


        
        System.out.println("B rows:");
        row = sc.nextInt();
        System.out.println("B columns:");
        col = sc.nextInt();
        Matrix B = new Matrix(row, col);
        B.make();

        System.out.println("-------------------");
        System.out.println("Lets print the matrix A:");
        A.print();
        System.out.println("");
        System.out.println("Lets print the matrix B:");
        B.print();
        System.out.println("");

        System.out.println("\n--------------------\n");
        System.out.println("A * B = ");

        Matrix C = Matrix.product(A, B);

        C.print();

        sc.close();
        
    }

}
