package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String output = generateOutput(request);
            response.getWriter().write(output);
        } catch (Exception e) {
            response.sendError(401);
        }
    }

    private String generateOutput(HttpServletRequest request) {
        // Generate output based on the request
        return "Sample output";
    }
}
