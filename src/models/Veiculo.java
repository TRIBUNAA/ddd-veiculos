package models;

public abstract class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double toTotal() {
        return valorHora + valorAdicional * (horas - 1);
    }

    public abstract double doDesconto();

    public abstract double doTotal();

    public String doViewCupom() {
        return String.format("Valor Hora: %.2f\nValor Adicional: %.2f\nHoras: %.2f\nTotal: %.2f",
                valorHora, valorAdicional, horas, toTotal());
    }
}
