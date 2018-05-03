import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Stuart", "ABC1", 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Stuart", databaseAdmin.getName());
    }
    @Test
    public void hasniNumber() {
        assertEquals("ABC1", databaseAdmin.getNiNUmber());
    }
    @Test
    public void hasSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(45000, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.01);
    }
}
