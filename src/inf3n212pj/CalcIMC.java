/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 201401665
 */
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner (System.in);
        float peso, altura, IMC;
        String classificacao;
        
        
        System.out.println("--Calculadora IMC--");
        System.out.print("Digite seu peso: ");
        peso = leia.nextFloat();
        System.out.print("Digite sua altura: ");
        altura = leia.nextFloat();
        
        IMC = peso/(altura * altura);
        System.out.println("Seu IMC é de: " + IMC);
        if(imc <=18.5){
            classificacao ="Abaixo do peso";
        }else if (imc <=24.9){
            classificacao ="Peso ideal";
        }else if (imc <=29.9){
            cassificacao =
        }
    }
        
                
    }
    
}
