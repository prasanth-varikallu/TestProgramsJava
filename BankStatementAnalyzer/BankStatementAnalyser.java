package BankStatementAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankStatementAnalyser {

    private static final String RESOURCES = "src/test/resources/Statement.csv";

    public static Month getMonthFromString(String date) {
        DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyy");
        LocalDate inputDate = LocalDate.parse(date, DATE_PATTERN);
        return inputDate.getMonth();
    }

    public static double totalPerMonth(List<String> lines) {

        return lines
                .stream()
                .map(line -> line.split(","))
                .filter(line -> getMonthFromString(line[0]) == Month.JANUARY)
                .mapToDouble((line -> Double.parseDouble(line[1])))
                .sum();

    }

    public static double netTotal(List<String> lines) {
        return lines
                .stream()
                .map(line -> line.split(",")[1])
                .mapToDouble(Double::parseDouble)
                .sum();
    }



    public static void main(String[] args) throws IOException {

        var path = Paths.get(RESOURCES);
        List<String> lines = Files.readAllLines(path);

        var total = netTotal(lines);
        System.out.println(total);

        System.out.println(totalPerMonth(lines));
    }
}
