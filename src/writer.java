/**
 *
 * @author Dániel
 */
import java.io.*;
import java.util.ArrayList;

public class writer {
    
    
    public void writefile(String WriteFileURL, ArrayList<String> lista){
            try{
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(WriteFileURL+".txt", true));
                for(int i=0; i<lista.size();i++)
                {
                    bw.write(lista.get(i));
                    bw.write("\r\n");
                                                            
                }   
                bw.flush();
            }
            catch(IOException e){
                System.out.println("Hiba: "+e.getMessage());            //hiba kiíratása
            }
            finally{
                System.out.println("Az irási folyamat sikeresen lefutott");
            }
            
        
    }
}

