package ro.ase.csie.cts.g1093.singleton.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1093.singleton.models.BackEndServer;

public class TestSingleton {

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
	public void testSingletonValidity() {
		BackEndServer backendServer = BackEndServer.getServerConnection();
		BackEndServer anotherBackendServer = BackEndServer.getServerConnection();
		
		if(backendServer == anotherBackendServer) {
			assertTrue(true);
		} else {
			fail("The singleton is not working");
		}
	}

}
