
public class Circulo extends FiguraGeometrica {
    private float raio;
    
    public Circulo(float raio){
		this.raio = raio;
	}
    public Circulo(float raio, String cor){
		super(cor);
                this.raio = raio;
	}
    
    public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getArea(){
		float area = (float) ((Math.PI * (this.raio * this.raio))/2);
		return area;
	}
	
	public float getPerimetro(){
		float perimetro = (float) (2 * Math.PI * (this.raio));
		return perimetro;
	}
    
}
