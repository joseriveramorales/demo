import java.io.*;
public class FileWriteDemo {
    
    public static void main(String[] args) throws IOException{
        // Use configuration class later to remove code smell -> (Hard coding url's)
        File file = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesito.txt");
        File file2 = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesitoVacio.txt");
        FileInputStream fis = null;
        BufferedOutputStream outputStream = null;

        String resultado = "";
        try {
            fis = new FileInputStream(file);
            outputStream = new BufferedOutputStream(new FileOutputStream(file2));
           
            byte[] b = fis.readAllBytes();
            outputStream.write(b);
            System.out.println("\n Escribi el string -> " + resultado + " <- que lei de filesito.txt en filesitoVacio.txt \n");

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fis != null) fis.close();
            if(outputStream != null) outputStream.close();
        }
    }
}