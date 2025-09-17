package Inheritence.Examples;

class Printer {
    void print(String text) { System.out.println(text); }
}
class Report {
    private Printer printer;
    Report(Printer printer) { this.printer = printer; }
    void printReport() { printer.print("Printing Report"); }
}
public class Delegate {
    public static void main(String[] args) {
        Printer p = new Printer();
        Report r = new Report(p);
        r.printReport();
    }
}
