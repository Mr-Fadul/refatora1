package br.com.aula.refatoracaoparte1;

import java.util.*;
import java.util.Calendar;

public class RefatoracaoParte1 {
    
    static public double mensalidade;
    static public double novaMensalidade;
    static public int mes; 
    static public int mesAtual;
    
    static Calendar calendario;
    static Scanner entrada;
    
    public static void main(String[] args) {
        
        entrada = new Scanner(System.in);
        int contador = 1;
        
        while (contador <= 3){
            
            System.out.println("\nValor da mensalidade: ");
                mensalidade = entrada.nextDouble();
            
            System.out.println("\nMês de referência: ");
                mes = entrada.nextInt();
                calendario = Calendar.getInstance();
                mesAtual = calendario.get(Calendar.MONTH)+1;
                contador++;
                
            if (mes < mesAtual)
                novaMensalidade = mensalidade * 1.10;
            else
                novaMensalidade = mensalidade;
            
            System.out.println("RESULTADO");
            System.out.println("Mês atual: " + mesAtual);
            System.out.println("Referências: " + mes);
            System.out.println("Mensalidade " + mensalidade);
            System.out.println("Novo Valor: " + novaMensalidade);
        }
        
        System.out.println("\n==============");
        System.out.println("FINALL DO PROGRAMA");
        System.out.println("\n==============");
    
    }
    
}
