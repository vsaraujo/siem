/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splunk;

import Funcionalidades.TimeSIEMG;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Vítor
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TesteMain {
    public static void main(String[] args) throws IOException {
        TimeSIEMG time = null;
        new SplunkAuteSimultanea(time);
    }
}
        
        
        /*
        TimeSIEMG time = null;
        SplunkXML2Bean Bean;
        SplunkAuteSimultanea AuteSplunk = new SplunkAuteSimultanea(time);
        Bean = AuteSplunk.getBean();
        Bean.printConsole();
        */
    