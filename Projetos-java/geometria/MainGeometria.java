
public class MainGeometria {

    public static void main(String[] args) {
        
        FiguraGeometrica f = new FiguraGeometrica();
        System.out.println(f);
        
        System.out.println();
        
        FiguraGeometrica q = new Quadrado(10, "Verde");
        System.out.println(q.getCor());
        System.out.println(q.getArea());
        System.out.println(q.getPerimetro());
        
        System.out.println();
        
        FiguraGeometrica t = new Triangulo(8, 6, "Preto");
        System.out.println(t.getCor());
        System.out.println(t.getArea());
        System.out.println(t.getPerimetro());
        
        System.out.println();
        
        FiguraGeometrica r = new Retangulo(10, 7);
        System.out.println(r.getArea());
        System.out.println(r.getPerimetro());
        
        System.out.println();
        
        FiguraGeometrica c = new Circulo(4, "Vermelho");
        System.out.println(c.getCor());
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());
        
    }
    
}
