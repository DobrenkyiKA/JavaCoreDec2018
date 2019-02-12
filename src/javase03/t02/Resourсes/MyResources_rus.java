package javase03.t02.Resourсes;

import java.util.ListResourceBundle;

public class MyResources_rus extends ListResourceBundle {
    @Override
    public Object[][] getContents() {
        return new Object[][] {
                {"RightOrder", "Изображения в правильном порядке: "},
                {"true", "Истина"},
                {"false", "Ложь"},
                {"Locale", "Выберете локаль"},
                {"Rus", "Введите 1 чтобы сменить язык на Русский"},
                {"Eng", "Введите 2 чтобы сменить язык на Английский"},
                {"q0", "Что такое Java?"},
                {"q1", "Что такое JIT-компилятор?"},
                {"q2", "Являются ли слова delete, next, main, exit или null ключевыми в Java?"},
                {"q3", "Что если я напишу static public void вместо public static void?"},
                {"q4", "Какое значение по умолчанию для локальных переменных?"},
                {"u0", "Java - это высокоуровневый, объектно-ориентированный, надежный и безопасный язык программирования, независимый от платформы, высокопроизводительный, многопоточный и переносимый язык программирования. Он был разработан Джеймсом Гослингом в июне 1991 года. Его также можно назвать платформой, поскольку он предоставляет собственные JRE и API."},
                {"u1", "Компилятор Just-In-Time (JIT): используется для повышения производительности. JIT компилирует части байт-кода, которые имеют аналогичные функциональные возможности одновременно, и, следовательно, сокращает время, необходимое для компиляции. Здесь термин «компилятор» относится к переводчику из набора команд виртуальной машины Java (JVM) в набор команд конкретного ЦП."},
                {"u2", "Нет."},
                {"u3", "Программа компилируется и работает правильно, потому что порядок спецификаторов не имеет значения в Java."},
                {"u4", "Локальные переменные не инициализируются никакими значениями по умолчанию, ни примитивами, ни ссылками на объекты."},
                {"jcq", "Программа содержит 5 вопросов. Введите номер вопроса (0-4) или 'выход' чтобы завершить программу."},
                {"NumberOfQuestion", "Вопрос номер: "},
                {"petc", "Нажмите Enter чтобы продолжить..."}
        };
    }
}
