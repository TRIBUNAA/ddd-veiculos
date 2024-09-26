package models;

public class Segurado extends Veiculo implements ISeguroService {
    private double seguro;

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    @Override
    public double doDesconto() {
        return super.toTotal() * seguro / 100;
    }

    @Override
    public double doTotal() {
        return super.toTotal() - doDesconto();
    }

    @Override
    public String doViewCupom() {
        return String.format("Seguro: %.2f\nTotal com desconto: %.2f\nCupom Original:\n%s",
                seguro, doTotal(), super.doViewCupom());
    }
}
