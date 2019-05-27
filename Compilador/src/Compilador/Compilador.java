
package Compilador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Usuario
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        args = new String[] { "C:\\Users\\MariaJose\\Desktop\\Compilador\\test\\Prueba.txt" };
        //Simbolos.main(args);
        
        try {
            // Create a reference to the input file
            File inputFile = new File(args[0]);
        
            // Initialize the scanner
            Scanerrrrr scanner = new Scanerrrrr (new FileReader(inputFile));
        
            // Initialize the parser
            parser parser = new parser (scanner);            
            
            Object result = parser.parse().value;
            
            System.out.println("Result: " + result);
            
            File f;
            f = new File("C:\\Users\\MariaJose\\Desktop\\Compilador\\Codigo\\Pacientes.cpp");
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);  
            wr.write((String) result);
            wr.close();
            bw.close();
                    
        } catch (FileNotFoundException fnfEx) {
            System.out.println("FILE NOT FOUND: " + fnfEx.getMessage());
            fnfEx.printStackTrace();
        } catch (Exception ex) {
            System.out.println("FATAL: " + ex.getMessage());
            ex.printStackTrace();
        }
                
        
    }
    
}
