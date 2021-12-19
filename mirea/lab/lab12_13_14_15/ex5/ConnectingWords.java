package ru.mirea.lab.lab12_13_14_15.ex5;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ConnectingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        StringBuilder s = new StringBuilder();
        try(FileReader f = new FileReader(path)){
            int c;
            while((c=f.read())!=-1){
                s.append((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(getLine(s.toString()));
    }

    private static String  getLine(String s) {
        Queue<String> Add = new ArrayDeque<>(Arrays.asList(s.split(" ")));
        Set<String> added = new HashSet<>();
        added.add(Add.peek());
        StringBuilder sb = new StringBuilder(Add.remove());
        boolean wasAdded = true;

        while(!Add.isEmpty() && wasAdded){
            wasAdded = false;
            int i = 0;
            for (; i < Add.size(); i++) {
                String current = Add.remove();
                if(added.contains(current)) continue;
                if(current.startsWith(sb.substring(sb.length()-1).toLowerCase()) ||
                        current.startsWith(sb.substring(sb.length()-1).toUpperCase())){
                    sb.append(" ").append(current );
                    wasAdded = true;
                    added.add(current );
                    break;
                }
                Add.add(current );
            }
            for(; i< Add.size(); i++){
                String cur = Add.remove();
                if(added.contains(cur)) continue;
                Add.add(cur);
            }
        }
        return sb.toString();
    }
}