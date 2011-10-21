package com.eclipsesource.restfuse;

import static com.eclipsesource.restfuse.Assert.assertNoContent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;


public class DefaultCallbackResource_Test {
  
  DefaultCallbackResource resource;
  
  @Before
  public void setUp() {
    resource = new DefaultCallbackResource();
  }
  
  @Test
  public void testGetCreatesDefaultResource() {
    Response response = resource.get( null );
    
    checkResponse( response );
  }
  
  @Test
  public void testPutCreatesDefaultResource() {
    Response response = resource.put( null );
    
    checkResponse( response );
  }
  
  @Test
  public void testDeleteCreatesDefaultResource() {
    Response response = resource.delete( null );
    
    checkResponse( response );
  }
  
  @Test
  public void testHeadCreatesDefaultResource() {
    Response response = resource.head( null );
    
    checkResponse( response );
  }
  
  @Test
  public void testOptionsCreatesDefaultResource() {
    Response response = resource.options( null );
    
    checkResponse( response );
  }
  
  @Test
  public void testPostCreatesDefaultResource() {
    Response response = resource.post( null );
    
    checkResponse( response );
  }

  private void checkResponse( Response response ) {
    assertNoContent( response );
    assertEquals( MediaType.WILDCARD, response.getType() );
    assertNull( response.getHeaders() );
    assertNull( response.getBody( String.class ) );
    assertFalse( response.hasBody() );
  }
  
}
