import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("กรุณากรอกแม่สูตรคูณ");
        int soodkoon = input.nextInt();

        if (soodkoon > 0) {
            for (int i = 1; i <= 12; i++) {
                int result = soodkoon * i;
                System.out.println(soodkoon + "x" + i + ":" + result);
            }
        } else {
            System.out.println("กรุณากรอกเลขจำนวนเต็ม");
        }
        input.close();
        System.out.println("ตัวอย่างการกล่าวสวัสดีตามจำนวนครั้งที่กำหนด");
        int sayHello = 1;
        while (sayHello <= 6) {
            System.out.println("นางสาวสุชัญญา เถาวัลย์ รอบที่ " + sayHello);
            sayHello++;
        }
    }
}