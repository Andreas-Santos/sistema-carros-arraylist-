public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private double custo;
    private double valor;
    private int km;
    private int anoModelo;
    private int anoFabricacao;
    private String opcionais;
    private String observacao;
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }

    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getOpcionais() {
        return opcionais;
    }
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String imprimir() {
        return "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nAno de Fabricação: " + anoFabricacao +
               "\nAno de Modelo: " + anoModelo +
               "\nPlaca: " + placa +
               "\nKM: " + km +
               "\nValor: " + valor +
               "\nOpcionais: " + opcionais;
    }

    public String imprimirComCusto() {
        return "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nAno de Fabricação: " + anoFabricacao +
               "\nAno de Modelo: " + anoModelo +
               "\nPlaca: " + placa +
               "\nKM: " + km +
               "\nOpcionais: " + opcionais +
               "\nObservacao: " + observacao +
               "\nValor: " + valor +
               "\nCusto: " + custo;
    }
}