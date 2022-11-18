package PruebasPython;

import java.io.*;

public class pythonDoble {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder builder = new ProcessBuilder("python.exe","D:/Exercises/CositasPython/Script.py");
        ProcessBuilder builder2 = new ProcessBuilder("python.exe","D:/Exercises/CositasPython/Script2.py");

        builder.redirectInput(ProcessBuilder.Redirect.INHERIT);
        builder2.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        try{
            Process process = builder.start();
            Process process2 = builder2.start();

            InputStream inputStream = process.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1);

            String line, line2 = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                line2 = line;
            }

//            InputStream inputStream2 = process2.getInputStream();
//            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream2));

            OutputStream outputStream = process2.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            bufferedWriter.write(line2);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            inputStream.close();
            bufferedReader.close();

        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
