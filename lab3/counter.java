/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author INTEL
 */
public class counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        counter1 obj=new counter1();
        //System.out.println(counter1.i);
        //System.out.println(obj.j);
        System.out.println("object 1:");
        obj.increment();
     
        
        counter1 obj1=new counter1();
        //System.out.println(counter1.i);
        //System.out.println(obj1.j);
        System.out.println("object 2:");
        obj1.increment();
        
        counter1 obj2=new counter1();
        //System.out.println(counter1.i);
        //System.out.println(obj2.j);
        System.out.println("object 3:");
        obj2.increment();
        
    }
    
}
class counter1
    {
        static int i=10;
        int j=10;
        void increment()
        {
            i=i+10;
            j=j+10;
            System.out.println(i);
            System.out.println(j);
                    
        }
        void display()
        {
          System.out.println(i+j);  
        }
    }
