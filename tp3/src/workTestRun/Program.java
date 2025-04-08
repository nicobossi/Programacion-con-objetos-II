package workTestRun;

import java.util.GregorianCalendar;

import unq.po2.tp3.person.Person;
import unq.po2.tp3.workTeam.WorkTeam;

public class Program {

	public static void main(String[] args) {
		
		WorkTeam aTeam = new WorkTeam("Sancor salud");
		
		aTeam.addPerson(new Person("Nicolás", new GregorianCalendar(1995, 5, 16)));
		aTeam.addPerson(new Person("Matias", new GregorianCalendar(1996, 4, 13)));
		aTeam.addPerson(new Person("Nicolás", new GregorianCalendar(2000, 11, 12)));
		aTeam.addPerson(new Person("Nicolás", new GregorianCalendar(2002, 7, 2)));
		aTeam.addPerson(new Person("Nicolás", new GregorianCalendar(1995, 8, 1)));
		
		System.out.print("El promedio de edad es " + aTeam.ageAverage());

	}

}
