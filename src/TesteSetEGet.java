public class TesteSetEGet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(235867);
        conta.setAgencia(1875);
        conta.deposita(2342.87);
        Cliente Marcela = new Cliente();
        Marcela.setNome("Marcela");
        Marcela.setCpf("098.765.432-10");
        Marcela.setProfissao("Professora");
        Marcela.setNascimento("31/9/1994");
        conta.setTitular(Marcela);
        System.out.println(conta.getTitular().getNome());
    }
}
