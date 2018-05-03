import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Stuart", "ABC1", 40000.00, "Development");
    }

    @Test
    public void hasName() {
        assertEquals("Stuart", manager.getName());
    }
    @Test
    public void hasniNumber() {
        assertEquals("ABC1", manager.getNiNUmber());
    }
    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }
    @Test
    public void hasDepartment() {
        assertEquals("Development", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(45000, manager.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);

    }

}
