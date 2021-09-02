package io.nspai.FileHandling;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndPath {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath("/Gauthier/User/foo.txt");

        System.out.format("getFileName : %s%n",path.getFileName());
        System.out.format("getParent : %s%n",path.getParent());
        System.out.format("getNameCount : %d%n",path.getNameCount());
        System.out.format("getRoot : %s%n",path.getRoot());
        System.out.format("isAbsolute : %b%n",path.isAbsolute());
        System.out.format("toAbsolutePath : %s%n",path.toAbsolutePath());
        System.out.format("toURI : %s%n",path.toUri());

    }
}
