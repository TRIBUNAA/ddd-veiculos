package models;
public class BalancoDiario {
    private static int qtdeCarros = 0;
    private static double total = 0.0;

    public void doAdd(Veiculo obj) {
        qtdeCarros++;
        total += obj.toTotal();
    }

    public String doGerarRelatorio() {
        return String.format("Quantidade de Carros: %d\nTotal arrecadado: %.2f", qtdeCarros, total);
    }
}

