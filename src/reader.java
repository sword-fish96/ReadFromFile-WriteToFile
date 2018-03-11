/**
 *
 * @author Dániel
 */
import java.io.*;
import java.util.ArrayList;

public class reader {
    
    public ArrayList<String> readfile(String ReadFileURL){
        RandomAccessFile raf;                                //File beolvasása ezen keresztül
        String sor;                                          //Ebben tárolódik az aktuális sor
        ArrayList<String> lista =new ArrayList<String>();    //String lista létrehozása
            try{
                raf=new RandomAccessFile(ReadFileURL,"r");
                for(sor=raf.readLine(); sor!=null; sor=raf.readLine()){
                    lista.add(sor);                                         //aktuális sor hozzáadása a listához
                }   
            }
            catch(IOException e){
                System.out.println("Hiba: "+e.getMessage());            //hiba kiíratása
            }
            finally{
                System.out.println("Az olvasási folyamat befelyeződött");
            }
            
        return lista;
    }
        
    
}

