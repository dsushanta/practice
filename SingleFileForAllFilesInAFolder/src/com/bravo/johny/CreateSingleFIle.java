package com.bravo.johny;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CreateSingleFIle {

    static Set<String> folderNameList = new HashSet<>();
    static Set<File> fileList = new HashSet<>();

    public static void main(String[] args) {
        String parentFolder = "/Users/admin/tmp/java/AppiumDemo";
        String fileExtension = "java";

        addFoldersInAFolderToFolderList(parentFolder);
        getListOfAllFilesInAFolder(fileExtension);
        createConsolidatedFile(fileExtension);
    }

    private static void getListOfAllFilesInAFolder(String fileExtension) {
        for (String folderName : folderNameList) {
            File folder = new File(folderName);
            File[] files = folder.listFiles();
            for(File file : files) {
                if(file.isFile()) {
                    String fileName = file.getName();

                    if (!fileName.contains("."))
                        continue;

                    String[] splits = fileName.split("\\.");
                    String ext = splits[splits.length - 1];
                    if (ext.equalsIgnoreCase(fileExtension))
                        fileList.add(file);
                }
            }
        }
    }

    private static void createConsolidatedFile(String fileExtension) {
        File consolidatedFile = new File(fileExtension+".txt");
        for(File file : fileList) {
            addFileContent(file, consolidatedFile);
        }
    }

    private static void addFileContent(File file, File consolidatedFile) {
        String fileName = file.getAbsolutePath();
        String content;
        BufferedReader br = null;
        FileReader fr;
        FileWriter fw =null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            fw = new FileWriter(consolidatedFile, true);

            content = fileName + System.lineSeparator();

            String line = br.readLine();
            while(line != null) {
                content = content + line + System.lineSeparator();
                line = br.readLine();
            }
            content = content + "----------------------------------------------------------------------" + System.lineSeparator();

            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addFoldersInAFolderToFolderList(String folderName) {
        if(!containsAFolder(folderName))
            return;
        folderNameList.add(folderName);

        File currentFolder = new File(folderName);
        File[] files = currentFolder.listFiles();
        for(File file : files) {
            if(file.isDirectory()) {
                folderNameList.add(file.getAbsolutePath());
                addFoldersInAFolderToFolderList(file.getAbsolutePath());
            }
        }
    }

    private static boolean containsAFolder(String folderName) {
        File currentFolder = new File(folderName);
        File[] files = currentFolder.listFiles();
        for (File file : files) {
            if(file.isDirectory())
                return true;
        }
        return false;
    }
}
