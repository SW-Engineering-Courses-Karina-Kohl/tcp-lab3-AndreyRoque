public class Retangulo extends FiguraGeometrica {

    private double largura, altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }
    
    public void setLargura (double largura){
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2*(altura + largura);
    }

    @Override
    public String getTipoFigura(){
        return "Retângulo";
    }
    
    @Override
    public String getDetalhes(){
        return "Altura: " + altura + " | Largura: " + largura;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " | " + getDetalhes();
    }
}
