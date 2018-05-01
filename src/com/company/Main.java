package com.company ;
public class Main {

    public static void main(String[] args) {
        int[] sysMonetaire = new int[] {200,100,50,20,10,5,2,1};
        Glouton D = new Glouton() ;
        D.glouton(250,sysMonetaire) ; // donner le montant en centimes
        /*
        EssaisSuccessifs Q = new EssaisSuccessifs() ;
        Q.essaisSuccessifs(0,0.5);
        for(int i=0;i<8;i++){
            System.out.println(Q.X[i] +"\n");
           // System.out.println(Q.Y[i] + "\n");
        }

        System.out.println("----------------------------- \n");
        for(int i=0;i<8;i++){
            System.out.println(Q.Y[i] + "\n");
        }*/


    }
}
