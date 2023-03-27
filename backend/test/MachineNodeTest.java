import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.credersi_vend.routes.nodes.MachineNode;

public class MachineNodeTest {


	@Test
	public void testGetLabel() {
		MachineNode node = new MachineNode();
		assertEquals(node.getLabel(), "Machine");
	}

	@Test
	public void testGetLocation() {
		MachineNode node = new MachineNode();
		assertEquals(node.getLocation(), null);
	}

	@Test
	public void testLocation() {
		MachineNode node = new MachineNode();
		node.location("test");
		assertEquals(node.getLocation(), "test");
	}

}
