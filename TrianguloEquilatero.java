public class TrianguloEquilatero extends FiguraGeometrica {

    private double lado;

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double calcularPerimetro(){
        return 3*lado;
    }

    @Override
    public String getTipoFigura(){
        return "Triâgulo Equilatero";
    }
    
    @Override
    public String getDetalhes(){
        return "Lados: " + lado;
    }

    @Override
    public String getInfo(){
        return String.format(
            "%s | %s | %s | Perímetro: %.2f | Área: %.2f",
            getTipoFigura(),
            super.getInfo(),
            getDetalhes(),
            calcularPerimetro(),
            calcularArea()
        );
    }
}
