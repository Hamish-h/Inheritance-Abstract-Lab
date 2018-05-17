import Staff.Tech.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{
    DatabaseAdmin databaseadmin;

    @Before
    public void before() {
        this.databaseadmin = new DatabaseAdmin ("Hamish", 124, 20000);
    }

    @Test
    public void canGetName() {
        assertEquals("Hamish", databaseadmin.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals(124, databaseadmin.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000, databaseadmin.getSalary());
    }


    @Test
    public void getRaiseSalary() {
        assertEquals(20005.55, databaseadmin.raiseSalary(5.55), 1);
    }

    @Test
    public void getPayBonus() {
        assertEquals(200, databaseadmin.payBonus());
    }



}
