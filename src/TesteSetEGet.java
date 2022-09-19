public class TesteSetEGet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        try{
            conta.setNumero(235867);
        }
        catch (NumeroInvalidoException ex){
            System.out.println("Informe um número inteiro válido");
        }

        conta.setAgencia(1875);
        conta.deposita(2342.87);
        Cliente Marcela = new Cliente();
        Marcela.setNome("Marcela");
        Marcela.setCpf("098.765.432-10");
        Marcela.setProfissao("Professora");
        Marcela.setNascimento("31/9/1994");
        conta.setTitular(Marcela);
        int value = 2000;
        if(!conta.saca(value)){
            System.out.println("Não foi possível realizar o saque de R$" + value +". Saldo atual de: R$" + conta.getSaldo());
        } else {
            System.out.println("Saque de R$" + value + " realizado com sucesso.");
            System.out.println("O valor atual da conta é de: R$" + conta.getSaldo());
        }

    }
}
