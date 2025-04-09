package unq.po2.tp3.person;

import java.time.LocalDate;

public class BirdthCalculator {

	int calculateTo(Person person) {
		return hasBirthday(person) ? newAgeTo(person) : currentAge(person);
	}

	private int newAgeTo(Person person) {
		return currentAge(person) + 1;
	}

	private int currentAge(Person person) {
		return currentYear() - person.yearToBirdth() - 1;
	}

	private int currentYear() {
		return LocalDate.now().getYear();
	}

	private boolean hasBirthday(Person person) {
		return wasBirdthdayThisMounth(person);
	}
	
	private boolean wasBirdthdayThisMounth(Person person) {
		return currentMonth() > person.monthToBirdth();
	}

	private int currentMonth() {
		return LocalDate.now().getMonthValue();
	}


}
