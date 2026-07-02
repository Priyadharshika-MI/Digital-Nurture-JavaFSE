package com.cts.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub void method to throw exception
        doThrow(new RuntimeException("Mock Exception"))
                .when(mockApi)
                .sendNotification(anyString());

        MyService service = new MyService(mockApi);

        // Verify exception
        assertThrows(
                RuntimeException.class,
                () -> service.notifyUser()
        );

        // Verify interaction
        verify(mockApi).sendNotification("CTS Notification");
    }
}