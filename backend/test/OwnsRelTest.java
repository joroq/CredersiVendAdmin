import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.credersi_vend.routes.rels.OwnsRel;

public class OwnsRelTest {

	

	@Test
	public void testGetLabel() {
		OwnsRel rel = new OwnsRel();
		assertEquals(rel.getLabel(), "OWNS");
	}

}
