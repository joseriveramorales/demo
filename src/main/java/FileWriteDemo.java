import java.io.*;
public class FileWriteDemo {
    
    public static void main(String[] args) throws IOException{
        File file = new File("/Users/joserivera/Desktop/Code/JavaIO/demo/src/resources/filesito.txt");
        FileInputStream fis = null;
        String resultado = "";
        try{
            fis = new FileInputStream(file);
            System.out.println("Total file size to read (in bytes) " + fis.available());
            int content;
            while((content = fis.read()) != -1){
                System.out.println((char) content);
                resultado += ((char) content);
            }
            System.out.println(resultado);
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();
            } catch( IOException ex){
                ex.printStackTrace();
            }
        }
    }
    
}