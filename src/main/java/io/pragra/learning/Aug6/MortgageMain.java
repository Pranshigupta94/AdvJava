package io.pragra.learning.Aug6;

public class MortgageMain {
    public static void main(String[] args) {

        MortgageCal mortgageCal = new MortgageCal();

       // mortgageCal.mortgageRenewal(3, 1.053, (x,y) ->  8*x*y);

//        mortgageCal.mortgageRenewal(3,
//                1.053,
//                RBCMortgageRenewal :: RBCRenewals,
//                System.out ::println ); // (i) -> system.out.println(i)

        mortgageCal.mortgageRenewal(3, 1.053,
                RBCMortgageRenewal :: RBCRenewals,
                System.out ::println,
                RBCMortgageRenewal :: saveToDb);
    }
}
