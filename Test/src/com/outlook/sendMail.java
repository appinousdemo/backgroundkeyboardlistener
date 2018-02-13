package com.outlook;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class sendMail
{
    public static void main(String[] args) throws URISyntaxException
    {
        String subject="password";
        String body="See%20it";
        String cc="brath@inautix.co.in";

        try {
            Desktop.getDesktop().mail( new URI( "mailto:prrout@inautix.co.in?subject="+subject+"&cc="+cc+"&body="+body) );
        } 
        catch ( IOException ex )
        {
        }
    }
}