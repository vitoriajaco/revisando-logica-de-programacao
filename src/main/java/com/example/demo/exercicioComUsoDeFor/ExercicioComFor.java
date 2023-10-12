package com.example.demo.exercicioComUsoDeFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExercicioComFor {

  /*  private static final Scanner scanner = new Scanner(System.in);*/

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um numero ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 0;
        /*int  N = scanner.nextInt();*/



        for(i= 1; i <= 10; i++){
            int result = ( N * i);
            System.out.println(N + "*"+ i + "=" + result);


            bufferedReader.close();
        }
    }

}
