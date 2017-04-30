package m6;
import java.io.*;
public class M6 {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s,q,w;
      int i;
      System.out.print("введите предложение:");
      s=br.readLine ();
      System.out.print("введите слово, которое нужно заменить:");
      q=br.readLine ();
      System.out.print("введите слово, на которе нужно заменить:");
      w=br.readLine ();
      String [] t=s.split(" ");
      s="";
      for(i=0;i<t.length;i++){
        if (t[i].equalsIgnoreCase(q)) s=s+w+" ";
        else s=s+t[i]+" ";
      }
      System.out.println(s);
    }    
}
