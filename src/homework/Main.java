package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ключ pro: ");
        String proKey = scanner.nextLine();

        System.out.print("Введіть ключ exp: ");
        String expKey = scanner.nextLine();

        DocumentWorker worker;
        if (!expKey.isBlank()) {
            worker = new ExpertDocumentWorker();
        } else if (!proKey.isBlank()) {
            worker = new ProDocumentWorker();
        } else {
            worker = new DocumentWorker();
        }

        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();
    }
}
