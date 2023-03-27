import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.credersi_vend.routes.rels.RouteRel;

public class RouteRelTest {


	@Test
	public void testGetLabel() {
		RouteRel rel = new RouteRel();
		assertEquals(rel.getLabel(), "ROUTE");
	}

	@Test
	public void testGetDirections() {
		RouteRel rel = new RouteRel();
		assertEquals(rel.getDirections(), null);
	}

	@Test
	public void testDirections() {
		RouteRel rel = new RouteRel();
		rel.directions("test");
		assertEquals(rel.getDirections(), "test");
	}

}
