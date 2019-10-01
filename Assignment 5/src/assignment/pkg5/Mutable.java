/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author alexn
 */
public class Mutable {
    List <String> immutable= Collections.EMPTY_LIST;
    List <String> mutable = new ArrayList();
    
    public Mutable(){
     
    }
    public void bringFile( List l) throws FileNotFoundException, IOException{
        Path path = Paths.get("example.txt");
        File file = path.toFile();
        BufferedReader in = new BufferedReader( new FileReader(file));
        l.add(in.readLine());
      
     
       }
       
    

    /**
     * adds something to prove its a mutable collection
     * @param l
     */
    public void changelist(List l){
        l.add(0, l);
    }
    public void show(List l){ 
        int number = l.size();
    
        int index = 0;
       while (index != number){
       System.out.print(l.get(index));
       index++;
       }
    }
}
