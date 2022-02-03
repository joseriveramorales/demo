import java.io.*;
public class FileWriteDemo {
    
    public static void main(String[] args) throws IOException{
        File file = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesito.txt");
        File file2 = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesitoVacio.txt");
        FileInputStream fis = null;
        FileOutputStream fout = null;

        String resultado = "";
        try{
            fis = new FileInputStream(file);
            fout = new FileOutputStream(file2);
           
            int content;
            while((content = fis.read()) != -1){
                resultado += ((char) content);
                fout.write(content);
            }
            System.out.println("Escribi el string -> " + resultado + " <- que lei de filesito.txt en filesitoVacio.txt");

        } catch(IOException e){
            e.printStackTrace();
        } 
    }
    
}