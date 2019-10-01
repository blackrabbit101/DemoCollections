/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alexn
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        List<String> mutable = new ArrayList();
        // this should work
        Mutable m = new Mutable();
        m.bringFile(mutable);
        m.changelist(mutable);
        m.show(mutable);
        List<String> immutable ;
        immutable = Collections.unmodifiableList(mutable);
        //should work up to here
        //this might not work
        try{
        m.bringFile(immutable);
        m.changelist(immutable);
        m.show(immutable);
        }catch(UnsupportedOperationException e){
                System.out.println("\nCaught Collection error for an immutable Collection when trying to append");
                }
        // TODO code application logic here
    }
    
}
