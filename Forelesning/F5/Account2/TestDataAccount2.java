package Forelesning.F5.Account2;

class TestDataAccount2 {
    public static void main(String[] args) {
        final double TOLERANCE = 0.001;
        System.out.println("Totale number of tests: 3");

        Account2 accountOle = new Account2(123456676756L, "Ole Olsen", 0.0);

        boolean transOk = accountOle.doTransaktion(1000);   // setter inn et beloep
        double nySaldo = accountOle.getSaldo();
        if (transOk && Math.abs(nySaldo - 1000) < TOLERANCE) {
            System.out.println("Account: Test 1 successfull");
        }

        Account2 accountPer = new Account2(223456676756L, "Per Olsen", 3000.0);
        transOk = accountPer.doTransaktion(-1000);   // tar ut et bel�p
        nySaldo = accountPer.getSaldo();
        if (transOk && Math.abs(nySaldo - 2000) < TOLERANCE) {
            System.out.println("Account: Test 2 successfull");
        }

        Account2 accountEva = new Account2(323456676756L, "Eva Olsen", 0.0);
        transOk = accountEva.doTransaktion(-100);   // fors�ker � overtrekke konto
        nySaldo = accountEva.getSaldo();
        if (!transOk && Math.abs(nySaldo - 0) < TOLERANCE) {
            System.out.println("Account: Test 3 successfull");
        }


    }
}


/* Utskrift:

 */