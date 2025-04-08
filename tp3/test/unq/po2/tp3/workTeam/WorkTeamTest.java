package unq.po2.tp3.workTeam;

import static org.junit.jupiter.api.Assertions.*;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp3.person.Person;

class WorkTeamTest {

	private WorkTeam aTeam;
	
	@BeforeEach
	void setUp() throws Exception {
		aTeam = new WorkTeam("Equipo 2");
	}

	@Test
	void unEquipoDeTrabajoTieneUnNombre() {
		
		assertEquals("Equipo 2", aTeam.getName());
	}
	
	@Test
	void unEquipoSabeElPromedioDeEdadDeSusIntegrantes() {
		
		aTeam.addPerson(new Person("Nicolás", new GregorianCalendar(1995, 5, 16)));
		aTeam.addPerson(new Person("Ramiro", new GregorianCalendar(2000, 6, 12)));
		aTeam.addPerson(new Person("Maria", new GregorianCalendar(2000, 7, 15)));
		
		assertEquals(25, aTeam.ageAverage());
	}

}
