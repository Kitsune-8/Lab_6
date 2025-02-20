class Reader{
    private String FIO;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;
    public Reader (String FIO, String ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.FIO = FIO;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }
    public void takeBook (int quantity) {
        System.out.println(FIO + " вернул " + quantity + " книги");
    }
    public void takeBook(String... bookTitles) {
        String titles = String.join(", ", bookTitles);
        System.out.println(FIO + " взял книги: " + titles + ".");
    }
    public void returnBook(int quantity) {
        System.out.println(FIO + " вернул " + quantity + " книги.");
    }

    public void returnBook(String... bookTitles) {
        String titles = String.join(", ", bookTitles);
        System.out.println(FIO + " вернул книги: " + titles + ".");
    }
}
public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В. В.", "001", "Исторический", "01.01.2000", "89164194570");
        readers[1] = new Reader("Иванова Д. С.", "002", "Экономическй", "02.02.2001", "88915794319");
        readers[2] = new Reader("Сидоров К. Л.", "003", "Биологический 3", "03.03.2002", "81679513647");
        readers[3] = new Reader("Кузнецов М. К.", "004", "Математический 4", "04.04.2003", "89164199878");
        readers[4] = new Reader("Куликов Д. Д.", "005", "Юриспруденция", "05.05.2004", "88915794366");


        for(int i = 0; i < 5; i++){
            readers[i].takeBook("Приключения", "Словарь", "Энциклопедия");
            readers[i].takeBook(3);
            readers[i].returnBook("Приключения", "Словарь", "Энциклопедия");
            readers[i].returnBook(3);
        }
    }
}
