/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;
import java.util.Scanner;

/**
 *
 * @author Laura Alvarez C
 */
public class semana5 {
    static Scanner leer= new Scanner (System.in);
    static int x ,n,opcion;
    public static void main(String[] args){
         System.out.println("digite el tamaño de la matriz");
            x=leer.nextInt();
            int matriz[][] = new int[x][x];
        for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
                                System.out.println("posición"+i+" "+j);
				matriz[i][j]=leer.nextInt();
                               
                                System.out.print(matriz[i][j]+" ");
			}
		}
     System.out.println("digite el numero para la matriz");
     n=leer.nextInt();
     do{
         System.out.println("\n\t\t MENU DE MATRICES");
			System.out.println("\t 1.Sumar ");
			System.out.println("\t 2.Restar ");
			System.out.println("\t 3.Multiplicar ");
			System.out.println("\t 4.Dividir");
			System.out.println("\t 5.Finalizar ");
			System.out.print("\n Seleccione  una opción: ");
			opcion = leer.nextInt();
         switch(opcion){
             case 1: sumar(matriz); break;
             case 2:restar(matriz); break;
             case 3:multiplicar(matriz); break;
             case 4:dividir(matriz); break;
             case 5: System.out.println("Adios"); break;
            
         }
     }while(opcion != 5);
     }
    private static void sumar(int [][]matriz){
        int sumar[][]= new int[x][x];
        System.out.println("SUMAR INGRESADO");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sumar[i][j]= matriz[i][j]+n;
                System.out.println(sumar[i][j]);
            }
        }
    }
    private static void restar(int [][]matriz){
        int restar[][]= new int[x][x];
        System.out.println(" RESTAR INGRESADO");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                restar[i][j]= matriz[i][j]-n;
                System.out.println(restar[i][j]);
            }
        }
    }
    private static void multiplicar(int [][]matriz){
        int multi[][]= new int[x][x];
        System.out.println("MULTIPLICAR INGRESADO");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                multi[i][j]= matriz[i][j]*n;
                System.out.println(multi[i][j]);
            }
        }
    }
    private static void dividir(int [][]matriz){
        int divi[][]= new int[x][x];
        System.out.println("DIVIDIR INGRESADO");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                divi[i][j]= matriz[i][j]/n;
                System.out.println(divi[i][j]);
            }
        }
    }
} 



