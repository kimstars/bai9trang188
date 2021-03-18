package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrintArr(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void sortA(int[][] arr, int n, int m) {
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = n - 1; j > i; j--) {
                    if (arr[j][k] < arr[j - 1][k]) {
                        int t = arr[j][k];
                        arr[j][k] = arr[j - 1][k];
                        arr[j - 1][k] = t;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int imax = 0;
        int jmax = 0;
        int n = sc.nextInt();//nhập kích thước ma trận
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = rd.nextInt(10);
                if (arr[imax][jmax] < arr[i][j]) arr[imax][jmax] = arr[i][j];
            }
        }

        PrintArr(arr, n, m);

        System.out.println("Giá trị max là: " + arr[imax][jmax] + ", tại vị trí [" + imax + "," + jmax + "]");


        //----------- so nguyen to // TODO: 17-Mar-21
        System.out.println("Các số nguyên tố trong ma trận :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(arr[i][j])) {
                    System.out.print(arr[i][j] + "  ");
                }
            }
        }

        //Sap xep cac cot theo thứ tự tăng dần
        System.out.println();
        System.out.println("Sắp xếp các cột theo thứ tự tăng dần:");
        sortA(arr, n, m);
        PrintArr(arr, n, m);


    }
}
