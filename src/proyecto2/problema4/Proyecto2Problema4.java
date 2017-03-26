/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.problema4;
import java.util.Scanner;
/**
 *
 * @author danii
 * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
 */
public class Proyecto2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano=solicitaentero("el tamaño del arreglo:");
        int [][]arreglo= arreglo("A",tamano);
        suma(arreglo);
        suma2(arreglo);
        suma3(arreglo);
    }
    
   public static int[][] arreglo(String a,int tamano){
        int [][]arreglo= new int [tamano][tamano];
        System.out.println("Arreglo "+a);
      
        for (int i=0; i<arreglo.length;i++){
        for (int j=0;j<arreglo[i].length;j++){
        arreglo[i][j]= solicitaentero("un número entero: ");
        }
        }
        return arreglo;
        }
    
    public static int solicitaentero(String b){
        Scanner key=new Scanner (System.in);
        int a=0;
        boolean flag=true;
        do{
            try{
                System.out.println("Escribe "+b);
                a=key.nextInt();
                flag=false;
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
                
            }
        }
        while(flag);
        return a;
    }
        
    public static void suma(int[][]a){//promedio, min, max y diagonal
        double b=0;
        double prom;
        int max, min,c=0;
        min=max=a[0][0];
        System.out.println("Matriz:");
         for (int i=0;i<a.length;i++){
             c=c+a[i][i];//diagonal
             
            for(int j=0;j<a.length;j++){
                b=b+a[i][j];//promedio
                
                System.out.print("["+a[i][j]+"]");
                if(min>a[i][j])
			{
				min=a[i][j];
			}
			if(max<a[i][j])
			{
				max=a[i][j];
			}         
            }
            
             System.out.println();
            
        }
         prom=(b/16);
         System.out.println();
         System.out.println("Promedio: "+prom);
         System.out.println("Mínimo: "+min);
         System.out.println("Máximo: "+max);
         System.out.println("Suma de la diagonal:"+c);
         System.out.println();
         
    }
    
    
    public static void suma2(int[][]a){//suma de diagonal superior
        double b=0;
        int x=0;
         for (int i=0;i<a.length;i++){        
            for(int j=x;j<a.length;j++){
                b=b+a[i][j];//promedio
                
                System.out.print("["+a[i][j]+"]");                                       
            }
            x=x+1;
            
             System.out.println();
            
        }
         System.out.println("Suma de la diagonal superior: "+b);
        }
    
    public static void suma3(int[][]a){//suma de diagonal inferior
        double b=0;
        int x=a.length-1;

         for (int i=a.length-1;i>=0;i--){        
            for(int j=x;j>=0;j--){
                b=b+a[i][j];
                System.out.print("["+a[i][j]+"]");                                       
            }
            x=x-1;
             System.out.println();
            
        }
         System.out.println("Suma de la diagonal inferior: "+b);
         
        }
        
        
    
}
