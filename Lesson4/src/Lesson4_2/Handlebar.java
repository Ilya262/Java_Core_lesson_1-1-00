package Lesson4_2;

public class Handlebar {
	private int diametr;
	

	Handlebar(int diametr) {
		this.diametr = diametr;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	@Override
	public String toString() {
		return "diametr=" + diametr;
	}
	public void handleb() {
		this.diametr=25;
		System.out.print("diametr="+diametr+" ");
		
	}
}
