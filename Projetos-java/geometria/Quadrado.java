
public class Quadrado extends FiguraGeometrica {
    private float lado;
	
	public Quadrado(float lado){
		this.lado = lado;
	}
	
	public Quadrado(float lado, String cor){
		super(cor);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float getArea(){
		float area = this.lado * this.lado;
		return area;
	}
	
	public float getPerimetro(){
		float perimetro = this.lado * 4;
		return perimetro;
	}

    
}
