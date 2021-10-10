package imc.atividade.service;


import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class service {
    public static String calculadora(Double peso, Double altura) {

        DecimalFormat banana = new DecimalFormat("###,##0.00");
        Double imc = peso / Math.pow(altura, 2);

        String azul = banana.format(imc);

        if (imc < 18.5) {
            return "Você está abaixo do peso, seu imc é: " + azul;
        }    else if (imc >= 18.5 && imc <= 24.9){
            return "Seu peso está normal, seu imc é: " + azul;
        }    else if (imc >= 25 && imc <= 29.9){
            return "Você está com sobrepeso, seu imc é: " + azul;
        }    else if (imc >= 30 && imc <= 34.9){
            return "Você está com obesidade classe I, seu imc é: " + azul;
        }    else if (imc >= 35 && imc <= 39.9){
            return "Você está com obesidade classe II, seu imc é: " + azul;
        }    else if (imc >= 40) {
            return "Você está com obesidade classe III, seu imc é: " + azul;
        }    else {
            return "Valor inválido. Tente novamente.";
        }
    }
}
