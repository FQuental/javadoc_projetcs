/**
 * Classe que simula uma conta.
 * @author FQuental
 * @version 1.0
 */
public class Conta {

    /**
     * @param num Recebe o numero da conta
     * @param agen Codigo da agencia correspondente
     */
    public int num, agen;

    /**
     * @param saldo Saldo atual da conta
     */
    public double saldo;

    /**
     * Contrutor default da classe
     */
    public Conta(){}

    /**
     * Construtor completo da classe
     * @param num Inicializa com um numero de conta especifico
     * @param agen Inicializa com um codigo de agencia especifico
     * @param saldo Inicializa com um saldo incial a nova conta
     */
    public Conta(int num,int agen,double saldo){
        this.num=num;
        this.agen=agen;
        this.saldo=saldo;
    }

    /**
     * Decrementa o valor do parametro do saldo da conta
     * @param valor Valor á ser decrementado
     */
    public void retira(double valor){
        saldo-=valor;
    }
    /**
     * Acrescenta o valor do parametro do saldo da conta
     * @param valor Valor á ser acrescentado
     */
    public void deposita(double valor){
        saldo+=valor;
    }
    /**
     * Metodo para retornar o valor atual do saldo
     * @return Valor do saldo atual
     */
    public double verificaSaldo(){
        return saldo;
    }
}

