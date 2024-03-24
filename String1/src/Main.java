public class Main {
    public static void main(String[] args) {
        String text = "Метод необходимо написать без использования регулярных выражений.";
        System.out.println(sequentialWordsNumbers(text));
    }

    public static StringBuilder sequentialWordsNumbers(String text) {
        StringBuilder allText = new StringBuilder("");
        int start = 0;
        int index = 0;
        int num = 0;

        for (index = 0; index <= text.length(); index++) {
            start = index;
            index = text.indexOf(" ", start);

            if (index == -1) {
                String b = text.substring(start);
                num++;
                allText.append(" (" + num + ") " + b);
                return allText;
            }
//          System.out.println(allText);

            String a = text.substring(start, index);
            num++;
            allText.append(" (" + num + ") " + a);

//        System.out.println(index);
//          System.out.println(start);
        }
        return allText;
    }
}