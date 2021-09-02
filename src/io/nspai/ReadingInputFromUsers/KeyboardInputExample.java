package io.nspai.ReadingInputFromUsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputExample {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            String name = "";
            // Read each input line and echo it to the screen
            while(name != null){
                System.out.println(" Type xyz to exit : ");
                name = in.readLine();
                if(name != null) name = name.trim();
                System.out.println("Read : " + name);
                if( name.equals("xyz")) System.exit(0);
            }
        }catch (IOException e){
            System.out.println("Exception Occured "+ e);
        }
    }
}
