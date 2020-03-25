package Lesson14;

public class Commodity {
	private String name;
	private int length;
	private int width;
	private int weinght;
	public Commodity(String name, int length, int width, int weinght) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weinght = weinght;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeinght() {
		return weinght;
	}
	public void setWeinght(int weinght) {
		this.weinght = weinght;
	}
	@Override
	public String toString() {
		return "name=" + name + ", length=" + length + ", width=" + width + ", weinght=" + weinght;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weinght;
		result = prime * result + width;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weinght != other.weinght)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	

}
