package com.example.demo.exercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;

@SpringBootTest
class ExercicioComForTest {
    @Mock
    BufferedReader bufferedReader;

    @Test
    public void validaSeNAtendeACondicaoTest() throws IOException {
        Mockito.when(bufferedReader.readLine()).thenReturn("2");
        boolean result =  ExercicioComFor.validaSeNAtentendeCondicao(bufferedReader);
        Assertions.assertEquals(false, result);

    }

    @Test
    public void validaSeNNaoAtendeACondicaoTest() throws IOException {
        Mockito.when(bufferedReader.readLine()).thenReturn("21");
        boolean result =  ExercicioComFor.validaSeNAtentendeCondicao(bufferedReader);
        Assertions.assertEquals(true, result);

    }
    @Test
    public void validaSeNAtendeACondicaoComNumeroNegativoTest() throws IOException {
        Mockito.when(bufferedReader.readLine()).thenReturn("-20");
        boolean result =  ExercicioComFor.validaSeNAtentendeCondicao(bufferedReader);
        Assertions.assertEquals(true, result);

    }



}







