
public class Retangulo extends FiguraGeometrica{
    private float altura;
    private float base;
    
    public Retangulo(float altura, float base){
		this.altura = altura;
                this.base = base;
	}
    public Retangulo(float altura, float base, String cor){
		super(cor);
                this.altura = altura;
                this.base = base;
	}
    
    public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
    
        public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	
	public float getArea(){
		float area = this.base * this.altura;
		return area;
	}
	
	public float getPerimetro(){
		float perimetro = (this.altura + this.base) + (this.base + this.altura);
		return perimetro;
	}
    
}
