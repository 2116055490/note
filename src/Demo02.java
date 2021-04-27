import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/4/27 16:58
 */
public class Demo02 {
    public static void main(String[] args) {
        int [] a = new int[2];
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        a[0] = i;
        a[1] = j;
        try{
            System.out.println(a[0] / a[1]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("越界异常");
        }catch (NumberFormatException e){
            System.out.println("数据格式不对");
        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }

        /*int [] a = new int[2];
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        a[0] = i;
        a[1] = j;
        try{
            System.out.println(a[0] / a[1]);

        }catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println("只能捕获其中一个错误");
        }
*/

    }
}
