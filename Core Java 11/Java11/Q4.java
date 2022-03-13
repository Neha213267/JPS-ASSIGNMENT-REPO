package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Q4 {
    public static void main(String[] args) throws IOException {
        var stu = "src/Studentlist.txt";
        String out = Files.readString(Path.of(stu));
List<String> lines = out.lines()
.filter(line -> !line.isBlank())
.map(String::strip)).toList();
        System.out.println("names : "+lines+" \ncount : "+lines.size());
    }
}
