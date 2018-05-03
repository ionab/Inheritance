import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Stuart", "ABC1", 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Stuart", developer.getName());
    }
    @Test
    public void hasniNumber() {
        assertEquals("ABC1", developer.getNiNUmber());
    }
    @Test
    public void hasSalary() {
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(45000, developer.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus() {
        assertEquals(400, developer.payBonus(), 0.01);
    }
}
