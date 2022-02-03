import java.io.*;
public class FileWriteDemo {
    
    public static void main(String[] args) throws IOException{
        File file = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesito.txt");
        File file2 = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesitoVacio.txt");
        FileInputStream fis = null;
        BufferedOutputStream outputStream = null;

        String resultado = "";
        try{
            fis = new FileInputStream(file);
            outputStream = new BufferedOutputStream(new FileOutputStream(file2));
           
            byte[] b = fis.readAllBytes();
            outputStream.write(b);

            System.out.println("\n Escribi el string -> " + resultado + " <- que lei de filesito.txt en filesitoVacio.txt \n");

            fis.close();
            outputStream.close();
        } catch(IOException e){
            e.printStackTrace();
        }    
    }
}