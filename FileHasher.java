import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileHasher {

    public static void main(String[] args) {
        try {
            // TODO (FH-1): create the JavaFileSystem directory

            File directory = new File("JavaFileSystem");
            if (directory.mkdir() == true) {
                System.out.println("Directory made.");
            } else {
                System.out.println("The folder (JavaFileSystem) is already there");
            }


            // TODO (FH-2): create notes.txt, data.txt, log.txt and write a sentence into each

            File notes = new File(directory, "notes.txt");
            File data = new File(directory, "data.txt");
            File log = new File(directory, "log.txt");


            try (FileWriter notesWriter = new FileWriter(notes)) {
                notesWriter.write("Hello, this is notes.txt and my name is Mateo :)");
            }

            try (FileWriter dataWriter = new FileWriter(notes)) {
                notesWriter.write("I love data, I am data.");
            }

            try (FileWriter logWriter = new FileWriter(notes)) {
                notesWriter.write("log, log, log, log, blog, fog, log.");
            }

            // TODO (FH-3): read each file back, print it, and write all three into Backup/backup.txt
            // TODO (FH-4): print each file's name next to hashFile(path)
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    /**
     * Reads the file at filePath and returns its SHA-256 hash
     * as a lowercase 64-character hexadecimal string.
     */
    public static String hashFile(String filePath) throws IOException {
        // TODO (FH-4): read the whole file, digest it, convert the bytes to hex
        return "";
    }
}