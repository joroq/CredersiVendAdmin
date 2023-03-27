import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.credersi_vend.routes.nodes.DomainNode;

/**
 * 
 */

/**
 * @author JoanneGreenhalgh
 *
 */
public class DomainNodeTest {

	

	/**
	 * Test method for {@link com.credersi_vend.routes.nodes.DomainNode#getLabel()}.
	 */
	@Test
	public void testGetLabel() {
		DomainNode node = new DomainNode();
		assertEquals(node.getLabel(), "Domain");
	}

	

	/**
	 * Test method for {@link com.credersi_vend.routes.nodes.DomainNode#getEnvironment()}.
	 */
	@Test
	public void testGetEnvironment() {
		DomainNode node = new DomainNode();
		assertEquals(node.getEnvironment(), null);
	}

	/**
	 * Test method for {@link com.credersi_vend.routes.nodes.DomainNode#environment(java.lang.String)}.
	 */
	@Test
	public void testEnvironment() {
		DomainNode node = new DomainNode();
		node.environment("test");
		assertEquals(node.getEnvironment(), "test");
	}


}
