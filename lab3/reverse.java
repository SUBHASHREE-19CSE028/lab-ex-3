/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.*;

/**
 *
 * @author INTEL
 */
public class reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a[];
        a =new int[10];
        int i,n;
        System.out.println("Enter the limit:");
        n=obj.nextInt();
        System.out.println("Enter the array values:");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        array.reverse1(a,n);
    } 
}
class array
{
    static void reverse1(int a[],int n)
    {
        int i;
        System.out.println("The reverse of an array:");
        for(i=n-1;i>=0;i--)
        {
            System.out.println(""+a[i]);
        }
    } 
}

    
    

