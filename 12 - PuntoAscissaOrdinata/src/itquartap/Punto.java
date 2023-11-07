package itquartap;

public class Punto {
	private int x;
	private int y;
	
	
	
	public Punto(int a, int o){
		x = a;
		y = o;
	}
	//METODI CHE OTTENGONO - GET
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//METODI CHE IMPOSTANO - SET
	public void setX(int a) {
		x = a;
	}
	public void setY(int o) {
		y = o;
	}
	public String toString() {
		return "Punto(" + x + ", " + y + ")";
	}
}
