package ro.ase.csie.cts.g1093.strategy.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1093.prototype.models.ServerBackend;
import ro.ase.csie.cts.g1093.strategy.models.BetterSetup;
import ro.ase.csie.cts.g1093.strategy.models.LowerSetup;
import ro.ase.csie.cts.g1093.strategy.models.ServerBackEnd;
import ro.ase.csie.cts.g1093.strategy.models.StandardSetup;

public class TestStrategy {

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
	public void testStrategyChangeSetupImplementationToLowerSetup() {
		ServerBackEnd server = new ServerBackEnd("127.0.0.1", 3000, 0, false);
		server.changeSetupStrategy(new StandardSetup());
		server.changeSetup(8080, 2);
		
		assertEquals("Testing standard setup change" , 2, server.getMaxConnections());
		assertEquals("Testing standard setup change" , 8080, server.getPort());
		
		server.changeSetupStrategy(new LowerSetup());
		server.changeSetup(8081, 1);
		
		assertEquals("Testing lower setup change" , 1, server.getMaxConnections());
		assertEquals("Testing lower setup change" , 8081, server.getPort());
		
		
	}
	
	@Test
	public void testStrategyChangeSetupImplementationToBetterSetup() {
		ServerBackEnd server = new ServerBackEnd("127.0.0.1", 3000, 0, false);
		
		server.changeSetupStrategy(new StandardSetup());
		server.changeSetup(8080, 2);
		
		assertEquals("Testing standard setup change" , 2, server.getMaxConnections());
		assertEquals("Testing standard setup change" , 8080, server.getPort());
		
		server.changeSetupStrategy(new BetterSetup());
		server.changeSetup(3000, 2);
		
		assertEquals("Testing better setup change" , 4, server.getMaxConnections());
		assertEquals("Testing better setup change" , 3000, server.getPort());
	}

}
