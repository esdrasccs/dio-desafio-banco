public class Banco {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public void saldacaoCliente(){

        System.out.println("Olá Sr(a) "+ getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agencia é "
                        +getAgencia()+", conta "+getNumero()+
                        " e seu saldo de R$"+ getSaldo()+", já esta disponivel para saque.");
    }
}
