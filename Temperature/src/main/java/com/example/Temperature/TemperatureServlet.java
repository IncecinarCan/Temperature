package com.example.Temperature;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TemperatureServlet", value = "/Temperature-servlet")
class TemperatureServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Temperature";
    }

    public String getConversionTemp(String temperature)
    {
        return "";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Conversion cv = new Conversion();

        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML>\n";
        String title = "Temperature";

        String temp = request.getParameter(String.valueOf(cv));
        out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                "</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +
                temp +
                request.getParameter("temp") + "\n" +
                "  <P>Temperature: " + cv.getConversionTemp(temp));


    }

    public void destroy() {
    }
}