import java.io.*;

  
class Main{
    public static void main(String[] args) throws IOException
    {
        File txt = new File("sample.txt");
        FileInputStream fileio = new FileInputStream(txt);
        InputStreamReader inputio = new InputStreamReader(fileio);
        BufferedReader bufferedReader = new BufferedReader(inputio);
  
        String line;
        int wc = 0;
        int cc = 0;
        int lc = 0;
  
        while ((line = bufferedReader.readLine()) != null) {
                lc++;
                cc += line.length();
                String words[] = line.split("\\s+");
                wc += words.length;
               
                
            
        }
        System.out.println("Total word count = "+ wc);
        System.out.println("Total number of line = "+ lc);
        System.out.println("Total number of character = "+ cc);
        bufferedReader.close();
    }
}
