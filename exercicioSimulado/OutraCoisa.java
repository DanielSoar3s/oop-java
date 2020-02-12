package exercicioSimulado;

public class OutraCoisa extends Coisa {
	
	private int x2;
	private int y2;
	
	public OutraCoisa(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	
	public double metodoA() {
		double r = Math.pow((getX() - x2), 2) + Math.pow((getY() - y2), 2);
		double r2 = Math.sqrt(r);
		return r2;
		}
	
	public String toString() {
		return "\nOutra coisa"+
		super.toString() +
		"\n[" + x2 + ", " + y2 + "]";
		}


	public int getX2() {
		return x2;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getY2() {
		return y2;
	}


	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	
}
