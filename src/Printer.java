class Answer {
    public static int countNTriangle(int n){
        if (n<0) {
            return -1;
        }
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum +=i;
        }
        return sum;


    }

    public static void main(String[] args) {
        int n = 4;
        int result = countNTriangle(n);
        System.out.println("Треугольное число " + n + " равно: " + result);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}