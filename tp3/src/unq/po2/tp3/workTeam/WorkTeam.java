package unq.po2.tp3.workTeam;

import java.util.ArrayList;

import unq.po2.tp3.person.Person;

public class WorkTeam {
	
	private String name;
	private ArrayList<Person> workers;

	public WorkTeam(String name) {
		setName(name);
		setEmptyWorkers();
	}

	private void setEmptyWorkers() {
		this.workers = new ArrayList<Person>();
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int ageAverage() {
		return totalAges() / countToWorkers();
	}

	private int totalAges() {
		return getWorkers().stream().mapToInt(Person :: ages).sum();
	}

	private int countToWorkers() {
		return getWorkers().size();
	}

	private ArrayList<Person> getWorkers() {
		return this.workers;
	}

	public void addPerson(Person person) {
		getWorkers().add(person);
	}

}
