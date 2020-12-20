package com.myob.service;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.myob.controller.DemoController;
import com.myob.custom.Message;

public class DemoControllerTest {
	
	@InjectMocks
	DemoController demoController;
	
	@Mock
	Message messageObj;
	
	private static final String TEST_STRING = "Hello World!";
	
	@Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
	
	@Test
    public void testRootMessage() {
		String message = demoController.rootMessage();
		assertEquals(TEST_STRING, message);
    }
	
	@Test
    public void testRandomMessage() {
		Message message = demoController.sayHello(Mockito.anyString());
		assertEquals(TEST_STRING, message.getMessage());
    }
}
