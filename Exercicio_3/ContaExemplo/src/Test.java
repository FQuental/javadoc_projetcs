

public class Test {
    public static void main(String[] args){
        Conta carlos = new Conta();
        Conta pedro = new Conta(50, 99, 568.89);

        //testando Carlos
        System.out.println("Saldo de Carlos: "+ carlos.verificaSaldo());
        carlos.deposita(100);
        System.out.println("Saldo de Carlos: "+ carlos.verificaSaldo());
        carlos.retira(40.50);
        System.out.println("Saldo de Carlos: "+ carlos.verificaSaldo());

        //testando Pedro
        System.out.println("Saldo de Pedro: "+ pedro.verificaSaldo());
        pedro.retira(68.89);
        System.out.println("Saldo de Pedro: "+ pedro.verificaSaldo());
        pedro.deposita(100);
        System.out.println("Saldo de Pedro: "+ pedro.verificaSaldo());
    }
}
