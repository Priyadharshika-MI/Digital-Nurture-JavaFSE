package com.cts.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the void method
        doNothing().when(mockApi).sendNotification(anyString());

        MyService service = new MyService(mockApi);

        service.notifyUser();

        // Verify interaction
        verify(mockApi).sendNotification("Mockito Notification");
    }
}