package javase01.t06.entity;


public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        System.out.println("Приложение Блокнот");

        while (!notebook.isExit) {
            notebook.clearScreen();
            notebook.showMenu();
            switch (notebook.request().toUpperCase()) {
                case "NEW" : {notebook.newRecord(); break;}
                case "EDIT" : {notebook.editRecord(); break;}
                case "DELETE" : {notebook.deleteRecord(); break;}
                case "VIEW" : {notebook.showAllRecords(); break;}
                case "EXIT" : {notebook.exit(); break;}
                default: {System.out.println("Неверная команда, попробуйте еще раз.");}
            }
        }
    }

}
