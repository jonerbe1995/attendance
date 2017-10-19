import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The attendance program for the Software Development Club of UW-Madison
 * Made with love by the VP, Jon Erbe
 * Be sure to commit this to your own, remote copy of master!
 */
class Attendance {
    private static String name = "", word = "", total = name + " " + word;
    private static final String FILENAME = name + ".txt";

    public static void main(String[] args) throws IOException {
        //TODO: Fill your name and this week's word (ex: name = "Jon Erbe", word = "chili-pepper")
        name = "";
        word = "";

        alg(total);
    }

    public static String alg(String file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME));
        writer.write(file);
        writer.close();
        return file;
    }
}
