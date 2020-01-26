/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgitjavacode;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class MyFirstGitJavaCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        addition ob = new addition();
        int returnval = ob.add(4, 8);
        System.out.println("Return val : " + returnval);
    }

}

class addition {

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

}
