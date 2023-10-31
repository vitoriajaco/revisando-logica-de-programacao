package com.example.demo.exercicioComUsoDeFor;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Task
        Given an integer, N , print its first 10 multiples. Each multiple N (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
Constraint: 2 <= N <= 20*/

@SpringBootApplication
public class ExercicioComFor {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ExercicioComFor.class, args);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean valorInvalido = true;
        while(valorInvalido){
           valorInvalido = validaSeNAtentendeCondicao(bufferedReader);

        }

        bufferedReader.close();

    }

    public static boolean validaSeNAtentendeCondicao(BufferedReader bufferedReader) throws IOException {
        boolean valorInvalido = true;
        System.out.print("Digite um numero ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int i = 0;


        if (n >= 2 && n <= 20) {
            for (i = 1; i <= 10; i++) {
                int result = (n * i);
                System.out.println(n + " x " + i + " = " + result);

            }
            valorInvalido = false;

        } else {
            System.out.println("Numero fora do intervalo de 2 a 20");
        }
        return valorInvalido;
    }
}


