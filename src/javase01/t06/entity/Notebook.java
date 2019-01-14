package javase01.t06.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notebook {
    private Record[] records = new Record[0];
//    String requestParam;
    boolean isExit = false;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String request = "";


    public String request() {
        try {
            request = bufferedReader.readLine();
        } catch (IOException e) {}
        return request;
    }
    public void showMenu() {
        clearScreen();
        System.out.println("Введите команду для совершения необходимого действия:");
        System.out.println("new - создать новую запись;");
        System.out.println("edit - редактировать запись;");
        System.out.println("delete - удалить запись;");
        System.out.println("view - просмотреть все записи;");
        System.out.println("exit - завершить программу.");
    }
    public void showAllRecords() {
        for(int i = 0; i < records.length; i++) {
            System.out.println("Запись №" + i);
            System.out.println(records[i].getRecord());
            System.out.println();
        }
    }
    public void deleteRecord() {
        System.out.println("Введите номер записи");
        int numberOfRecord = Integer.parseInt(request());
        records[numberOfRecord].setRecord("Запись удалена");
    }
    public void exit() {
        isExit = true;
    }
    public void newRecord() {
        Record[] tempRecords = new Record[records.length + 1];
        System.arraycopy(records, 0,tempRecords, 0, records.length);
        System.out.println("Наберите запись");
        String record = request();
        tempRecords[tempRecords.length-1] = new Record(record);
        records = tempRecords;
    }
    public void editRecord() {
        System.out.println("Введите номер записи");
        int numberOfRecord = Integer.parseInt(request());
        System.out.println("Введите сообщение");
        records[numberOfRecord].setRecord(request());
    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}

