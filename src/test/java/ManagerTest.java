import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Davina", 123, 10000, "HR");
    }

    @Test
    public void canGetName() {
        assertEquals("Davina", manager.getName());
    }

    @Test
    public void canSetName() {
        assertEquals("Davina", manager.setName(""));
    }

    @Test
    public void canGetNInumber() {
        assertEquals(123, manager.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10000, manager.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void getRaiseSalary() {
        assertEquals(10000, manager.raiseSalary(-1.5), 0.5);
    }

    @Test
    public void getPayBonus() {
        assertEquals(100, manager.payBonus());
    }

}
