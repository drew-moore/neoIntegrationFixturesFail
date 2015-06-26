package org.mycompany.myproject;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.neo4j.harness.ServerControls;
import org.neo4j.harness.TestServerBuilders;

/** 
* FooResource Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 26, 2015</pre> 
* @version 1.0 
*/ 
public class FooResourceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: doFoobar() 
* 
*/ 
@Test
public void testDoFoobar() throws Exception {
    try ( ServerControls server = TestServerBuilders.newInProcessBuilder()
            .withExtension("/foo", FooResource.class)
            .withFixture("CREATE (x:foo{name:'bar'}) RETURN x")
            .newServer() )
    {
        int i = 3;
        // doStuff
    }


}


} 
