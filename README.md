## Задание 1. Компиляция и запуск приложения из командной строки.
Решение представлено в виде скриншотов:

#### 1. Создаем два класса `(Main, Logic)`, открываем терминал.
![   ](https://github.com/DobrenkyiKA/JavaCoreDec2018/blob/se01-t01/1.bmp)
      

####  2. Компилируем, указывая компилятору на каталог с файлами `(- sourcepath ./src)`, каталог для скомпилированных файлов `(-d out)` и точку входа `(Main.java)`
    javac -sourcepath ./src -d out src/javase01/t01/main/Main.java
![   ](https://github.com/DobrenkyiKA/JavaCoreDec2018/blob/se01-t01/2.bmp)

#### 3. Запускаем Main.class указывая путь к каталогу с классами `(-classpath ./out)`
    java -classpath ./out javase01.t01.main.Main
    
![   ](https://github.com/DobrenkyiKA/JavaCoreDec2018/blob/se01-t01/3.bmp)

#### 4. Вывод в терминал.
![   ](https://github.com/DobrenkyiKA/JavaCoreDec2018/blob/se01-t01/4.bmp)
