package com.company;

public class EssaisSuccessifs {
    double[] sysMonetaire = new double[] {2,1,0.5,0.2,0.1,0.05,0.02,0.01};
    public int [] X = new int [] {0,0,0,0,0,0,0,0} ;
    public int [] Y = new int [] {0,0,0,0,0,0,0,0} ;

    public void essaisSuccessifs(int i, double N){
        int xi ;
        double k = Math.floor(N/sysMonetaire[i]) ;
        System.out.println("caca") ;
        System.out.println(k) ;
        if(k>0) {
            for (xi = 1; xi < k + 1; xi++) {
                if (satisfaisant(xi,i, N)) {
                    Y[i] = xi;
                    if (i == sysMonetaire.length) {
                        if (meilleure(X, Y, N)) {
                            System.out.println("coucou hibou \n");
                            for (int h = 0; h < 8; i++) {
                                X[h] = Y[h];
                            }
                        }
                    } else {
                        i++ ;
                        essaisSuccessifs(i , reste(N));
                        System.out.println("reste : " + reste(5));
                    }
                }

            }
        }
        else {
            essaisSuccessifs(i + 1, N);
        }


        }


    public boolean satisfaisant(int xi, int i, double N) {
        double S = 0 ;
        for(int j=0 ;j<i-1;j++){
            S = S + X[j]*sysMonetaire[j] ;
        }
        S = S + xi*sysMonetaire[i] ;
        if (S<=N ){
            return true ;
        }
        else {
            return false ;
        }
    }

    public boolean meilleure(int[] X, int[] Y, double N ){
        double S1 = 0 ;
        int n1 = 0 ;
        double S2 = 0 ;
        int n2 = 0 ;
        for (int i =0 ; i<8 ; i++){
            S1 = S1 + X[i]*sysMonetaire[i] ;
            n1 = n1 + X[i] ;
            S2 = S2 + Y[i]*sysMonetaire[i] ;
            n2 = n2 + Y[i] ;
        }
        if (S1 != N || (n1> n2)){
            return true ;
        }
        else {
            return false ;
        }

    }

    public double reste(double N){
        double S = 0 ;
        for(int i=0 ; i< 8 ; i++) {
            S = S + Y[i]*sysMonetaire[i] ;
        }
        if(N - S > 0){
            return N - S ;
        }
        else { return 0 ; }
    }
}



