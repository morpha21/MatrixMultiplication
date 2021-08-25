/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author morpha
 */
public class Matrix {

    public int row;
    public int col;
    public double[][] matriz;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.matriz = new double[row][col];
    }

    public void make() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            for (int j = 0; j < col; j++) {
                matriz[i][j] = scan.nextDouble();
            }
        }
        
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static Matrix product(Matrix A, Matrix B) {
        if (A.col != B.row) {
            Matrix C = new Matrix(A.row, B.col);
            
            for (int i =0; i < A.row; i++){
                for (int j=0; j<B.col; j++){
                    C.matriz[i][j] = 0;
                }
            }
            
            
            System.out.println("invalid operation.");
            return C;
        } else {
            Matrix C = new Matrix(A.row, B.col);
            int c;
            
            for (int j=0; j<B.col; j++){
                for (int i = 0; i<A.row; i++){
                    for (int k=0; k<B.row; k++){
                        C.matriz[i][j] += A.matriz[i][k]*B.matriz[k][j];
                    }
                }
            }
            return C;

        }

    }
    
    
    
    

}
