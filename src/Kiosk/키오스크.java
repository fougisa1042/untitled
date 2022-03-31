package Kiosk;
import java.util.Scanner;

public class 키오스크 {
    static int 금액들 = 0;   // 모든 음식값을 저장해 두는곳
    static String[] 메뉴들 = new String[200]; //모든 주문메뉴 이름을 지정하는 곳
    static int 인덱스 = 0;     //메뉴들에 음식이름을 넣기위해 만든 것 나중에 인덱스판별을 위해 필요한변수

    /*static int totalprice = 0; //총 음식값 음식값 * 수량
    int Sulag; //호두과자의 수량을 저장해두는 곳
    int money2; //거스름돈 = 지불 금액 - 총음식값
*/

    면류9 면들 = new 면류9();
    밥류 밥들 = new 밥류();
    음료류 음료들 = new 음료류();
    매장_포장선택 매장포장선택 = new 매장_포장선택();
    계산 계산함 = new 계산();
    Scanner scanner = new Scanner(System.in);

    /* 면류 면1 = new 면류("짜장",5000);*/


    public void 키오스크실행() {
        키오스크 키오스크의 = new 키오스크(); //키오스크 객체 생성
         //사용자에게 입력받은것을 넣어놓기위한곳

        System.out.println("===========역전반점===========");
        System.out.println("주문하시겠습니까?(네:1/아니요:2)");
        String 유저입력2 = scanner.nextLine();
        if (유저입력2.equals("1")) { //1을 골랐는지 체크함
            while (true) { //무한반복문.결제하시겠냐? 라는 것때문에 사용하게됨


                매장_포장선택 매포2 = new 매장_포장선택();
                매포2.매장포장입력1();


                키오스크의.화면(); //키오스크의 ui메서드실행
                System.out.println("결제하시겠습니까? (네:1,아니요:2)");
                유저입력2 = scanner.nextLine(); //엔터후에 입력받은것을 넣어둠

                계산함.계산대();

                if (유저입력2.equals("1")) {//입력받은것이 1인지 체크함
                    키오스크의.주문("감사합니다 안녕히 가십시오");
                    break;

                } else if (유저입력2.equals("2")) {//입력받은것이 2인지 체크
                    System.out.println("안녕히 가십시오");
                    break;//반복문 퇴장

                    /*System.out.println("매장에서 드시고 가십니까?(네:1,아니요:2)");
                    유저입력2 = 입력2.nextLine();//입력받은것을 UserInput에 넣어둠
                    if (유저입력2.equals("1")) {//입력받은게 1인지 체크함
                        끼오스크.주문("매장식사"); //키오스크의 order메서드에 매장식사라는 String변수 전달
                        break;//반복문 퇴장
                    } else if (유저입력2.equals("2")) {//입력받은것이 2인지 체크
                        끼오스크.주문("포장"); //키오스크의 order메서드에 매장식사x라는 String변수 전달
                        break;//반복문 퇴장
                    }*/
                }
            }
        }
    }

    void 화면() { // ui 메소드
        while (true) {
            for (int i = 0; i <= 인덱스 - 1; i++) {//그냥 막 출력하면 null값떠서 값이 있는만큼 반복하게함. 한개의 물건이름을 넣은후 인덱스를 더하기때문에 인덱스-1해야함
                System.out.println(메뉴들[i]); //시킨메뉴들 보여줌
            }
            System.out.println("a.면 b.밥 c.음료");
            String 사용자입력 = scanner.nextLine(); //엔터친후 입력받은것을 UserInput에 넣어둠
            if (사용자입력.equals("a")) { //a을 눌렀는지 체크함
                면들.면류선택(); //면 System 메서드 실행
            } else if (사용자입력.equals("b")) {
                밥들.밥류선택();
            } else if (사용자입력.equals("c")) {
                음료들.음료류선택();
            }
            System.out.println("계속 주문하시겠습니까?(네:1,아니요:2)");
            사용자입력 = scanner.nextLine(); //또다시입력받은것을 UserInput에 넣어둠
            System.out.println("++++++주문 내역++++++");
            System.out.println("총 금액 : " + 금액들);

            매장포장선택.매장포장입력2();

            if (사용자입력.equals("2")) {//계속구매하지않겠다 할시
                break;//반복문 나감.
            }
        }//결과

        for (int i = 0; i <= 인덱스 - 1; i++) {
            System.out.printf(" %s \n ", 메뉴들[i]);
        }//이제 메인클래스로 돌아감
    }


    void 주문(String 주문됨) { //오더 메소드 주문되었다는 것을 보여줌
        /*  키오스크 주문 = new 키오스크();*/
        System.out.println("주문 되었습니다");

    }
}


    /*void 매장포장입력(){
        Scanner 입력2 = new Scanner(System.in); //스캐너객체 생성    11
        *//*키오스크 끼오스크 = new 키오스크(); //키오스크 객체 생성*//*
        String 유저입력2 = ""; //사용자에게 입력받은것을 넣어놓기위한곳


        System.out.println("선택해주세요. (매장 : 1 , 포장 : 2)");  /// 22
        유저입력2 = 입력2.nextLine();//입력받은것을 UserInput에 넣어둠   // 33
        if (유저입력2.equals("1")) {//입력받은게 1인지 체크함
            *//*System.out.println("매장 주문");*//* //키오스크의 order메서드에 매장식사라는 String변수 전달
            *//*break;//반복문 퇴장*//*
        } else if (유저입력2.equals("2")) {//입력받은것이 2인지 체크
           *//* System.out.println("포장 주문");*//* //키오스크의 order메서드에 매장식사x라는 String변수 전달
           *//* break;//반복문 퇴장*//*
        }

    }

    void 매장주문출력(){

        System.out.println(*//*매장 +*//* "매장 주문");



        *//*키오스크 매장 = new 키오스크();


        매장.실행1();
*//*
    }
    void 포장주문출력(){
        System.out.println( *//*포장+*//* "포장 주문");
        *//*키오스크 포장 = new 키오스크();
        포장.실행1();*//*

    }

}
*/



