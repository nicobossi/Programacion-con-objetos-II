package unq.po2.tp3.person;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	private Person aPerson;
	private Calendar birthDate;
	
	@BeforeEach
	void setUp() throws Exception {
		birthDate = new GregorianCalendar(1995, 5, 16);
		aPerson = new Person("Nicolás Bossi", birthDate);
	}

	@Test
	void UnaPersonaTieneUnNombre() {
		
		assertEquals("Nicolás Bossi", aPerson.getName());
	}
	
	@Test
	void UnaPersonaTieneUnaFechaDeNacimiento() {
		
		assertEquals(birthDate, aPerson.getBirthDate());
	}
	
	
	@Test
	void UnaPersonaSabeSuEdadAntesDeSuCumpliranios() {
		
		assertEquals(29, aPerson.ages());
	}
	
	@Test
	void UnaPersonaSabeSuEdadDespuesDeSuCumpliranios() {
		
		Person aPerson = new Person("Mariano Closs", new GregorianCalendar(1995, 01, 05));
		
		assertEquals(30, aPerson.ages());
	}
	
	@Test
	void UnaPersonaSabeSiEsMenorAOtra() {
		
		Person youngPerson = new Person("Mariano Pastore", new GregorianCalendar(2000, 6, 20));
		
		assertFalse(aPerson.isYoungTo(youngPerson));
		
		assertTrue(youngPerson.isYoungTo(aPerson)); // POSTCONDITION
	}

}
