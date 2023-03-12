package com.bravo.johny;

import java.io.*;

public class CreateSeparateFiles {

    static BufferedReader br = null;
    static FileReader fr = null;
    static String destinationFolder = "";

    public static void main(String[] args) {

        String consolidatedFileName = "/Users/admin/tmp/java/f0/css.txt";
        destinationFolder = "/Users/admin/tmp/java/f1";

        try {
            fr = new FileReader(consolidatedFileName);
            br = new BufferedReader(fr);

            while (true) {
                boolean endReached = createSeparateFile();
                if(endReached)
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean createSeparateFile() {
        FileWriter fw = null;
        try {
            String fileName = br.readLine();
            if(fileName == null)
                return true;
            String separator = System.getProperty("file.separator");
            separator = "\\\\";
            String[] split = fileName.split(separator);
            createFolderStructure(split);
            fileName = reArrangeFullFilePath(fileName);
            fw = new FileWriter(destinationFolder+fileName, true);
            String content = "";
            String line = br.readLine();
            while(line != null && !line.equalsIgnoreCase("----------------------------------------------------------------------")) {
                content = content + line + System.lineSeparator();
                line = br.readLine();
            }
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static void createFolderStructure(String[] folders) {
        int size = folders.length;
        String path = destinationFolder;
        for(int i=1; i<size-1; i++)
            path = path + "/" + folders[i];
        File file = new File(path);

        boolean bool = file.mkdirs();
        if(bool){
            System.out.println("Directory structure has been created successfully");
        }else{
            System.out.println("Sorry couldn’t create specified directory");
        }
    }

    private static String reArrangeFullFilePath(String file) {
        String[] split = file.split("\\\\");
        String reArrangedFileName = "";
        for(int i=1; i<split.length; i++)
            reArrangedFileName = reArrangedFileName + "/" + split[i];

        return reArrangedFileName;
    }
}
