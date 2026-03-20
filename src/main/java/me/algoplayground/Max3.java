package me.algoplayground;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구하시오.");

        int a = stdIn.nextInt();
        System.out.println("a의 값: " + a);

        int b = stdIn.nextInt();
        System.out.println("b의 값 : " + b);

        int c = stdIn.nextInt();
        System.out.println("c의 값 : " + c);

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.printf("최댓값은 " + max + "입니다.");
    }
}