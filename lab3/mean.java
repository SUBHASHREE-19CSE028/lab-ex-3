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
public class mean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double a[];
        a =new double[10];
        int i;
        System.out.println("Enter the limit:");
        int n=obj.nextInt();
        System.out.println("Enter the array values:");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextDouble();
        }
        average.mean(a,n);
        

    }
    
}
class average
{

    
    static void mean(double a[],int n)
    {
        int i;
        double tot=0;
        double ave;
        for(i=0;i<n;i++)
        {
         
            tot=tot+a[i]; 
           
        }
        System.out.println("Total:"+tot);
        ave=tot/5;
        System.out.println("Mean of array values:"+ave);
    }

}
