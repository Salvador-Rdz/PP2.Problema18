/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema18;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución
        print(comMult(getInf()));
    }
    public static int[] getInf() //Se recibe la información
    {
        int[]num=new int[3];  //Se crea el arreglo que recibirá los 3 números
        for(int i=0;i<num.length;i++)
        {
            Scanner in =new Scanner (System.in);
            System.out.println("Ingrese el número "+(i+1)+" :");
            num[i]=in.nextInt();            
        }
        return num;
    }
    public static int comMult(int[] nums) 
    {
        int minComMult=1;
        int numMax=Math.max(nums[2],Math.max(nums[0],nums[1])); //Se consigue cual es el número mayor.
        minComMult=numMax;  //Lógicamente, el MCM tiene que pasar por el número mayor.
        while(minComMult%nums[0]!=0 || minComMult%nums[1]!=0 || minComMult%nums[2]!=0) //Se saca el resultante, y se trata e llegar
        {                                                                              //a un número que divida los 3.                   
            minComMult++;
        }
        return minComMult;
    }
    public static void print (int maxComMult) //Se imprime
    {
        System.out.println("El mínimo común múltiplo de esos números es: "+maxComMult);
    }
}
