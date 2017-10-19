import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Attendance program for the Software Development Club of UW-Madison
 * Made with love by the VP, Jon Erbe
 * Be sure to commit this to your own, remote copy of the master branch!
 */
class Attendance {
    public static void main(String[] args) throws IOException {
        String name, word, fileName, total;

        //TODO: Fill your name and this week's word (ex: name = "Jon Erbe", word = "chili-pepper")
        name = "";
        word = "";

        fileName = name + ".txt";
        total = name + " " + word;
        alg(total, fileName);
    }

    private static void alg(String file, String fName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fName));
        writer.write(file);
        writer.close();
    }
}