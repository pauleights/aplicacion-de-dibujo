import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;

public abstract class Figura {
	
	private int x1;//cordenada x del peimr punto final
	private int y1;//cordenada y del peimrer punto final
	private int x2;//cordenada x del segundo punto final
	private int y2;//cordenada y del segundo punto final
	private  Paint color;//el color de esta figura
	private Stroke stroke;
	
	public Figura (){
		//pendiente checar si el null no afecta en algo
		
		this( 0, 0, 0, 0, Color.BLACK, new BasicStroke() );
	}
	
	/*
	 * VERIFICAR ORDEN DE LAS VARIABLES DEL CONSTRUCTOR
	 */
	
	public Figura ( int x1 , int y1, int x2, int y2 , Paint color, Stroke estilo ){
		establecerX1 ( x1 );
		establecerY1 ( y1 );
		establecerX2 ( x2 );
		establecerY2 ( y2 );
		establecerColor ( color );
		stroke = estilo;
	}
	
	public void establecerX1 ( int x1 ){
		if ( x1 >= 0 )
			this.x1 = x1;
		else
			this.x1 = 0;
	}
	public int obtenerX1 (){
		return x1;
	}
	
	public void establecerX2 ( int x2 ){
		if ( x2 >= 0 )
			this.x2 = x2;
		else
			this.x2 = 0;
	}
	public int obtenerX2 (){
		return x2;
	}
	
	public void establecerY1 ( int y1 ){
		if ( y1 >= 0 )
			this.y1 = y1;
		else
			this.y1 = 0;
	}
	public int obtenerY1 (){
		return y1;
	}
	
	public void establecerY2 ( int y2 ){
		if ( y2 >= 0 )
			this.y2 = y2;
		else
			this.y2 = 0;
	}
	public int obtenerY2 (){
		return y2 ;
	}
	
	public void establecerColor ( Paint colores ){
		color = colores;
	}
	public Paint obtenerColor (){
		return color;
	}
	
	public void establecerStroke ( Stroke estilo ){
		this.stroke = estilo;
	}
	public Stroke obtenerStroke (){
		return stroke;
	}
	
	//metodo abstracto para implementarlo en las subclasesconcretas
	public abstract void dibujar ( Graphics2D g );
		
	
}
