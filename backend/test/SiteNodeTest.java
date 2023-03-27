import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.credersi_vend.routes.nodes.SiteNode;

public class SiteNodeTest {

	

	@Test
	public void testGetLabel() {
		SiteNode node = new SiteNode();
		assertEquals(node.getLabel(), "Site");
	}

	@Test
	public void testGetAddress() {
		SiteNode node = new SiteNode();
		assertEquals(node.getAddress(), null);
	}

	@Test
	public void testGetOrigin() {
		SiteNode node = new SiteNode();
		assertEquals(node.getOrigin(), false);
	}

	@Test
	public void testAddress() {
		SiteNode node = new SiteNode();
		node.address("test");
		assertEquals(node.getAddress(), "test");
	}

	@Test
	public void testOrigin() {
		SiteNode node = new SiteNode();
		node.origin();
		assertEquals(node.getOrigin(), true);
	}

}
