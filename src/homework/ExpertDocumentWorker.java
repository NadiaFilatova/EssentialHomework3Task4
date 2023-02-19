package homework;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("документ збережений в новому форматі");
    }
}
