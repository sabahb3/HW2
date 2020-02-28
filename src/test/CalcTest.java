package test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.Calculater;
public class CalcTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdding_two_positve_integer() {
     int a=5;
     int b=8;
     assertTrue(Calculater.add(a,b)>0);
}
	@Test
	public void testAdding_two_negative_integer() {
     int a=-5;
     int b=-8;
     assertTrue(Calculater.add(a,b)<0);
}
	@Test
	public void testAdding_positve_and_negative_integer_positive_large() {
     int a=-5;
     int b=8;
     assertTrue(Calculater.add(a,b)>0);
}
	@Test
	public void testAdding_positve_and_negative_integer_negative_large() {
     int a=5;
     int b=-8;
     assertTrue(Calculater.add(a,b)<0);
}
}
