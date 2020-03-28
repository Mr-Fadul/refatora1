

/** CODIGO REFATORADO **/


package br.com.aula.refatoracaoparte2;

import java.util.Calendar;
import java.util.Scanner;

public class Refatoracao {

    static public double mensalidade;
    static public double novaMensalidade;
    static public int mes; 
    static public int mesAtual;
    static Calendar calendario;
    static Scanner entrada;
    
    public static void main(String[] args) {
        
        entrada = new Scanner(System.in);
        int contador = 1;
        
        while (contador <= QUANTIDADE){
            
            System.out.println("\nValor da mensalidade: ");
                mensalidade = entrada.nextDouble();
            
            System.out.println("\nMês de referência: ");
                mes = entrada.nextInt();
                calendario = Calendar.getInstance();
                mesAtual = calendario.get(Calendar.MONTH)+1;
                contador++;
                
               final double valorCalculadoMensalidade = mensalidade * 1.10;
               verificarValorMensalidade(valorCalculadoMensalidade);
               imprimirResultados();
            
        }
        
        System.out.println("\n==============");
        System.out.println("FINALL DO PROGRAMA");
        System.out.println("==============");
    
    }
    
    private static void verificarValorMensalidade(final double valorCalculadoMensalidade){

        if (mes < mesAtual) {
            novaMensalidade = mensalidade * 1.10;
        } else {
            novaMensalidade = mensalidade;
        }

    }
                
    private static void imprimirResultados(){
                    
        System.out.println("RESULTADO");
        System.out.println("Mês atual: " + mesAtual);
        System.out.println("Referências: " + mes);
        System.out.println("Mensalidade " + mensalidade);
        System.out.println("Novo Valor: " + novaMensalidade);

    }
                
    private static final int QUANTIDADE = 3;
                
}
