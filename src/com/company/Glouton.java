package com.company;
import java.text.DecimalFormat;

public class Glouton {
    int[] sysMonetaire = new int[] {200,100,50,20,10,5,2,1}; // centimes
    double [] X = new double[sysMonetaire.length]  ;

    public void glouton(int N, int[] pieces){
        int m = 100 *N ;
        int n = pieces.length ;
        for(int i=0;i<n;i++){
            X[i] = 0 ;
        }
        for(int i=0; i<n ; i++){
            while(N>= pieces[i]){
                N = N - pieces[i] ;
               // System.out.println(N + "\n");
                X[i] = X[i] + 1 ;


            }
        }
        System.out.print("montant non rendu :" + N + "\n");
        for(int i=0 ; i<n ; i++){
            System.out.println(X[i]) ;
        }
    }
}
