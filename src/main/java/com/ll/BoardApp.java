package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    public void run() {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> bodyList = new ArrayList<>();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = scan.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("제목 : ");
                String title = scan.nextLine();
                titleList.add(title);
                System.out.print("내용 : ");
                String body = scan.nextLine();
                bodyList.add(body);
                System.out.println("게시물이 등록되었습니다.");
            }else if (cmd.equals("list")){
               for(int i =0; i< titleList.size(); i++ ){
                   System.out.println("=======================");
                   System.out.println("번호 : "+ (i+1));
                   String title = titleList.get(i);
                   System.out.printf("제목 : %s\n" , title);

//                   String body = bodyList.get(i);
//                  System.out.printf("내용 : %s\n" , body );
               }    System.out.println("========================");

            }else if(cmd.equals("update")){
                System.out.print("수정할 게시물 번호 : ");
                int id = Integer.parseInt(scan.nextLine());

                System.out.print("새로운 제목을 입력해주세요 : ");
                String newTitle = scan.nextLine();

                System.out.print("새로운 내용을 입력해주세요 : ");
                String newBody = scan.nextLine();


                titleList.set(id-1 , newTitle);
                bodyList.set(id-1 , newBody);
                System.out.printf("%d번 게시물이 수정되었습니다.\n" ,  id);
            }
            else if (cmd.equals("delete")){
                System.out.println("삭제할 게시물 번호 : ");
                int id = Integer.parseInt(scan.nextLine());

                titleList.remove(id-1 ,)

                System.out.printf("%d번 게시물이 삭제되었습니다.\n", id);
            }

        }


    }


}
