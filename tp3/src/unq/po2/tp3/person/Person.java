package unq.po2.tp3.person;

import java.util.Calendar;

public class Person {

	private String name;
	private Calendar birthDate;

	public Person(String name, Calendar birthDate) {
		setName(name);
		setBirthDate(birthDate);
	}

	public String getName() {
		return this.name;
	}

	public Calendar getBirthDate() {
		return this.birthDate;
	}
	
	private void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int ages() {
		return new BirdthCalculator().calculateTo(this);
	}

	int yearToBirdth() {
		return getBirthDate().get(Calendar.YEAR);
	}

	int monthToBirdth() {
		return getBirthDate().get(Calendar.MONTH);
	}

	int dayToBirdth() {
		return getBirthDate().get(Calendar.DAY_OF_MONTH);
	}

	public boolean isYoungTo(Person aPerson) {
		return ages() < aPerson.ages();
	}

}
