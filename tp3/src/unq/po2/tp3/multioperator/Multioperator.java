package unq.po2.tp3.multioperator;

import java.util.ArrayList;

public class Multioperator {
	
	private ArrayList<Integer> numbers;

	public Multioperator() {
		setNumbers();
	}



	private void setNumbers() {
		numbers = new ArrayList<Integer>();
	}



	private ArrayList<Integer> getNumbers() {
		return this.numbers;
	}
	
	
	public void add(Integer number) {
		getNumbers().add(number);
	}


	public int sum() {
		return getNumbers().stream().reduce(0, (a, b) -> a + b);
	}


	public int multiply() {
		return getNumbers().stream().reduce(1, (a, b) -> a * b);
	}


	public int substract() {
		return getNumbers().stream().reduce(0, (a, b) -> a > b ? a - b : b - a);
	}
}
