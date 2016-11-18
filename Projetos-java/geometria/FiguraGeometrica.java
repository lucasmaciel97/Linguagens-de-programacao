
public class FiguraGeometrica {
    private String cor;

	public FiguraGeometrica(){
		super();
		this.cor = "Branco";
	}
	
	public FiguraGeometrica(String cor) {
		super();
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getArea(){
		return 0f;
	}
	
	public float getPerimetro(){
		return 0f;
	}

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "cor universal = " + cor + '}';
    }
    
        
}
