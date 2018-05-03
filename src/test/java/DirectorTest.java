import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    Director director;

    @Before
    public void before(){
        director = new Director("Stuart", "ABC1", 40000.00, "Development", 23000);
    }

    @Test
    public void hasName() {
        assertEquals("Stuart", director.getName());
    }
    @Test
    public void hasniNumber() {
        assertEquals("ABC1", director.getNiNUmber());
    }
    @Test
    public void hasSalary() {
        assertEquals(40000.00, director.getSalary(), 0.01);
    }
    @Test
    public void hasDepartment() {
        assertEquals("Development", director.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(45000, director.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus() {
        assertEquals(400, director.payBonus(), 0.01);
    }
    @Test
    public void canGetBudget() {
        assertEquals(23000, director.getBudget(), 0.01);
    }





}
