package unq.po2.tp3.person;

import java.time.LocalDate;

public class BirdthCalculator {

	public int calculateTo(Person person) {
		return haveBirthday(person) ? currentAge(person) : newAgeTo(person);
	}

	private int newAgeTo(Person person) {
		return currentAge(person);
	}

	private int currentAge(Person person) {
		return LocalDate.now().getYear() - person.yearToBirdth() - 1;
	}

	private boolean haveBirthday(Person person) {
		return wasBirdthdayThisMounth(person);
	}
	
	private boolean wasBirdthdayThisMounth(Person person) {
		return LocalDate.now().getMonthValue() > person.monthToBirdth();
	}


}
