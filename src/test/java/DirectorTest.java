import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before () {
        this.director = new Director ("Daniel", 125, 30000, "Executive", 20.22);
    }


    @Test
    public void canGetName() {
        assertEquals("Daniel", director.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals(125, director.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, director.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void getRaiseSalary() {
        assertEquals(30005, director.raiseSalary(5.01), 1);
    }

    @Test
    public void getPayBonus() {
        assertEquals(600, director.payBonus());
    }
}
