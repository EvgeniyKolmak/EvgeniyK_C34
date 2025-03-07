public class MainApp {

    public static void main(String[] args) {
        // Дана произвольная строка. Необходимо:
        String stroke = "apple;banana;chery;orange";

        // 1) Вывести длину строки
        System.out.println(stroke.length());

        // 2) Разбить строку по любому разделителю и вывести количество элементов
        String[] masOfWords = stroke.split(";");
        System.out.println(masOfWords.length);

        // 3) Получить подстроку с определенной позиции до конца
        String subString = stroke.substring(6);
        System.out.println(subString);

        // 4) Сделать строку, которая будет зеркальна текущей
        String reverseStroke = new StringBuilder(stroke).reverse().toString();
        System.out.println(reverseStroke);

        // Создать произвольный шаблон
        String template = String.format("My name is %s. I'm %d. I like %s", "Petr", 25, "apple");

        System.out.println(template);

    }

}
