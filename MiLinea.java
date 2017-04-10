//Fig. 8.18: MiLinea.java
//La clase MiLinea representa a una linea.
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;

public class MiLinea extends Figura{
	
	public MiLinea (){
		this(0, 0, 0, 0, Color.BLACK, new BasicStroke ());
	}
		
	//constructor con valores de entrada
	public MiLinea( int x1, int y1, int x2, int y2, Paint color, Stroke estilo ){
		super (x1, y1 , x2 , y2, color, estilo);
		
	}//fin del constructor de MiLinea
	
		
	//pendiente
	public void dibujar ( Graphics2D g ){
		g.setPaint( obtenerColor() );
		g.setStroke( obtenerStroke() );
		g.drawLine( obtenerX1(), obtenerY1(), obtenerX2(), obtenerY2());
		
	}//fin del metodo dibujar 
	
}//fin de la clase MiLinea
