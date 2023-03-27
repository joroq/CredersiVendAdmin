import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.credersi_vend.routes.nodes.CustomerNode;

/**
 * 
 */

/**
 * @author JoanneGreenhalgh
 *
 */
public class CustomerNodeTest {

	

	/**
	 * Test method for {@link com.credersi_vend.routes.nodes.CustomerNode#getLabel()}.
	 */
	@Test
	public void testGetLabel() {
		CustomerNode node = new CustomerNode();
		assertEquals(node.getLabel(), "Customer");
	}


}
