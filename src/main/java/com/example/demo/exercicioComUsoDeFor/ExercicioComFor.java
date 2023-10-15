package com.example.demo.exercicioComUsoDeFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Task
        Given an integer, N , print its first 10 multiples. Each multiple N (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
Constraint: 2 <= N <= 20*/


public class ExercicioComFor {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um numero ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 0;


        if (N >= 2 && N <= 20) {
            for (i = 1; i <= 10; i++) {
                int result = (N * i);
                System.out.println(N + " x " + i + " = " + result);

            }
            bufferedReader.close();

        } else {
            System.out.println("Numero fora do intervalo de 2 a 20");
        }

    }

}

