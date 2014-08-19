package com.baldurtech.batman;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatchServletTest {

    @Test
    public void service_只是一个测试() throws Exception {
        PrintWriter out = mock(PrintWriter.class);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(response.getWriter()).thenReturn(out);
        when(request.getContextPath()).thenReturn("/batman");

        DispatchServlet servlet = new DispatchServlet();

        servlet.service(request, response);

        verify(out).println("Hello /batman");
    }
}
