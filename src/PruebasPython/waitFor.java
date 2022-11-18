package PruebasPython;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class waitFor {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder("python.exe","D:/Exercises/CositasPython/infinito.py");
        ProcessBuilder builder2 = new ProcessBuilder("python.exe","D:/Exercises/CositasPython/unprint.py");

        builder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        builder2.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        Process p1 = builder.start();
        p1.waitFor(3000, TimeUnit.MILLISECONDS);
        p1.destroy();
        Process p2 = builder2.start();
    }
}
