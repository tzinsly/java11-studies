package com.cert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) {

        Path myFirstPath = Path.of("/dev", "..").resolve(Paths.get("./sleep.txt")).normalize();
        System.out.println("First resulting path: " + myFirstPath);

        //try {
            var path2 = Path.of("../sleep.txt");
            System.out.println("Another path: " + path2);
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}




    }
}
