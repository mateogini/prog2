package tp1punto3;

public class puntoGeometrico {
private double X;
private double Y;



// constructor
public puntoGeometrico() {
	X=0;
	Y=0;
}
//metodos
public void desplazar(double X, double Y) {
	this.X=this.X+X;
	this.Y=this.Y+Y;
}
public String getUbi() {
	return X+","+Y;
}
}
