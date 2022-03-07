package chapter09;

public class GenericPrinter<T> {
	
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	public String toString() {
		return meterial.toString();
	}

}
