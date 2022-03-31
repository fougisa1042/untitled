package 쓰레드연습1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserException
{
    public static void main(String args[])
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 예외처리
        try {
            System.out.println("하나의 숫자를 입력하세요 => ");
            int jumsu = Integer.parseInt(in.readLine());

            if(jumsu < 0) {      // jumsu변수가 0보다 작을 경우 인위적 예외처리
                throw new UserException1("점수가 너무 작음");
            }

            else if(jumsu > 100) {     // jumsu변수가 0보다  경우 인위적 예외처리
                throw new UserException2("점수가 너무 큼");
            }
            System.out.println("정상적인 점수 입력");
        }

        catch(UserException1 e) {
            System.out.println("UserException1 처리 루틴 : ");
            System.out.println(e + "발생");
        }

        catch(UserException2 e) {
            System.out.println("UserException2 처리 루틴 : ");
            System.out.println(e + "발생");
        }

        catch(Exception e) {
            System.out.println("모든 예외 처리 루틴 : ");
            System.out.println(e + " 발생");
        }
    }
}
