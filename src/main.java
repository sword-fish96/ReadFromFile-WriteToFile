/**
 *
 * @author Dániel
 */
import java.util.*;
public class main {

    
    public static void main(String[] args) {
        
        //Fájl beolvasása
        reader a=new reader();
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérem adjon meg egy elérési utat");
        String ReadFileURL=sc.nextLine();
        ArrayList<String> lista=a.readfile(ReadFileURL);
        System.out.println(lista.toString());
        
        //Fájl kiíratsáa
        writer b=new writer();
        System.out.println("Kérem adja meg az új fájl nevét");
        String WriteFileURL=sc.nextLine();
        b.writefile(WriteFileURL, lista);
        
        
        
    }
    
}

