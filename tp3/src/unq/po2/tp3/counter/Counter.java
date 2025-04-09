package unq.po2.tp3.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Counter {
	
	private List<Integer> numbers;
	
	public Counter() {
		setNumbers();
	}


	public Counter(Integer[] numbers) {
		setNumbers(numbers);
	}


	public void addNumber(Integer number) {
		getNumbers().add(number);
	}
	
	public void removeNumber(Integer number) {
		getNumbers().remove(number);
	}
	
	public long countPeer() {
		return peerNumbers().count();
	}
	
	public long countOdd() {
		return oddNumbers().count();
	}
	
	public long countMultipleTo(Integer multiple) {
		return multiplesTo(multiple).count();
	}


	 /* @throws Exception 
	 * */
	public int maxWithPare(int[] aNumbers) throws Exception {
		
		try {
			return maxNumberWithPare(aNumbers);
		}
		catch(Exception e) {
			throw new Exception(messageToEmptyNumbers());
		}
	}
	
	public int maxMultipleBetween(int firstNumber, int secondNumber) {
		
		return arePositives(firstNumber, secondNumber) 
				? maxMultipleTo(firstNumber, secondNumber)
				: -1;
	}


	private void addNumbers(List<Integer> numbers, Integer[] newNumbers) {
		
		int count = 0;
		
		while(count < newNumbers.length) {
			numbers.add(newNumbers[count]);
			count++;
		}
	}


	private String messageToEmptyNumbers() {
		return "No hay números";
	}


	private int maxNumberWithPare(int[] aNumbers) {
		
		int countToNumbers = 0;
		int max = 0;
		
		while(countToNumbers < aNumbers.length) {
			max = maxPareBetween(max, aNumbers[countToNumbers]);
			countToNumbers++;
		}
		
		return max;
	}


	private int maxPareBetween(Integer firstNumber, Integer secondNumber) {
		
		return countParesDigit(firstNumber) > countParesDigit(secondNumber) 
				? firstNumber 
				: secondNumber;
	}


	private int countParesDigit(Integer aNumber) {
		
		int count = 0;
		
		while(aNumber % 2 == 0) {
			count++;
			aNumber = aNumber / 2;
		}
		
		return count + 1;
	}


	private int maxMultipleTo(int firstNumber, int secondNumber) {
		
		int maxMultiple = 1000;
		
		while(!isDivisibleBetween(firstNumber, secondNumber, maxMultiple) 
				&& maxMultiple > 0) {
			maxMultiple--;
		}
		
		return maxMultiple;
		
	}
	
	private Stream<Integer> multiplesTo(Integer multiple) {
		return getNumbers().stream().filter(aNumber -> isMultipleTo(multiple, aNumber));
	}


	private boolean isMultipleTo(Integer multiple, Integer aNumber) {
		return aNumber % multiple == 0;
	}


	private Stream<Integer> oddNumbers() {
		return getNumbers().stream().filter(aNumber -> !isPare(aNumber));
	}


	private Stream<Integer> peerNumbers() {
		return getNumbers().stream().filter(aNumber -> isPare(aNumber));
	}

	private boolean isPare(Integer aNumber) {
		return aNumber % 2 == 0; 
	}


	private List<Integer> getNumbers() {
		return numbers;
	}
	
	private void setNumbers() {
		this.numbers = new ArrayList<Integer>();
	}
	
	private void setNumbers(Integer[] newNumbers) {
		setNumbers();
		addNumbers(getNumbers(), newNumbers);
	}


	private boolean isDivisibleBetween(int firstNumber, int secondNumber, int multiple) {
		return isMultipleTo(firstNumber, multiple) && isMultipleTo(secondNumber, multiple);
	}


	private boolean arePositives(int firstNumber, int secondNumber) {
		return firstNumber > 0 && secondNumber > 0;
	}
}
