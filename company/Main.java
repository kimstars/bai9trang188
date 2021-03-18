package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


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

    public static void PrintArr2D(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void PrintArr1D(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + "  ");
        }
        System.out.println();
        
    }

    public static void sortA(int[][] arr, int n, int m) { // cách của tó thẻo :3 
        for(int j = 0 ; j < m; j++){
            int[] subArr = new int[n];
            for(int i = 0; i < n; i++){
                subArr[i] = arr[i][j];
            }
            Arrays.sort(subArr);
            // PrintArr1D(subArr, n);
            for(int i = 0; i < n; i++){
                arr[i][j]  = subArr[i];
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

        PrintArr2D(arr, n, m);

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
        PrintArr2D(arr, n, m);


    }
}
