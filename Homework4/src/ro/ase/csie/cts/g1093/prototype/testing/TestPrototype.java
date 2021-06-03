package ro.ase.csie.cts.g1093.prototype.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1093.prototype.models.ServerBackend;

public class TestPrototype {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPrototypeCloningFunction() throws CloneNotSupportedException {
		ServerBackend serverOriginal = new ServerBackend("127.0.0.1", 3000, 1, true);
		ServerBackend serverBackup = (ServerBackend) serverOriginal.clone();
		
		if(serverOriginal == serverBackup) {
			fail("The prototype pattern is not working");
		} else {
			assertTrue(true);
		}
		
	}
	
	@Test
	public void testPrototypeCloningFunctionThenChangingAttributes() throws CloneNotSupportedException {
		ServerBackend serverOriginal = new ServerBackend("127.0.0.1", 3000, 1, true);
		ServerBackend serverBackup = (ServerBackend) serverOriginal.clone();
		
		String position = "128.0.0.5";
		serverOriginal.setIPAddress(position);
		
		serverBackup.disconnect();
		
		assertEquals("Checking original server changed attributes", position, serverOriginal.getIpAddress());
		assertEquals("Checking backup server maintained attributes", "127.0.0.1", serverBackup.getIpAddress());
		assertEquals("Checking backup server changed connection status", false, serverBackup.isConnected());
		assertEquals("Checking original server maintained connection status", true, serverOriginal.isConnected());
		
	}

}
