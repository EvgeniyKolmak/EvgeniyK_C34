public class MainApp {

    public static void main(String[] args) {
        // ���� ������������ ������. ����������:
        String stroke = "apple;banana;chery;orange";

        // 1) ������� ����� ������
        System.out.println(stroke.length());

        // 2) ������� ������ �� ������ ����������� � ������� ���������� ���������
        String[] masOfWords = stroke.split(";");
        System.out.println(masOfWords.length);

        // 3) �������� ��������� � ������������ ������� �� �����
        String subString = stroke.substring(6);
        System.out.println(subString);

        // 4) ������� ������, ������� ����� ��������� �������
        String reverseStroke = new StringBuilder(stroke).reverse().toString();
        System.out.println(reverseStroke);

        // ������� ������������ ������
        String template = String.format("My name is %s. I'm %d. I like %s", "Petr", 25, "apple");

        System.out.println(template);

    }

}
