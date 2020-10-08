import java.lang.Math;
import java.util.Scanner;

public class SchissorRockPaper {
    public static void main(String[] args) {
        int win = 0;
        while(win < 2){
            int comuter = (int)(Math.random() * 3);
    
            Scanner input = new Scanner(System.in);
            System.out.print("choose the number(0-2) : ");
            int user = input.nextInt();
            String strCom = "";
            String strUser = "";
            String result = "";
            if(user <= 2){
                switch(comuter){
                case 0:
                    strCom = "scissor";
                    if(user == 0){
                        strUser = "scissor too";
                        result = "It is a draw";
                    }else if (user == 1){
                        strUser = "rock";
                        result = "You lose";
                        win++;
                    }else if (user == 2){
                        strUser = "paper";
                        result = "You won";
                        win++;
                    }
                    break;
                case 1:
                    strCom = "rock";
                    if(user == 0){
                        strUser = "scissor";
                        result = "You lose";
                        win++;
                    }else if (user == 1){
                        strUser = "rock too";
                        result = "It is a draw";
                    }else if (user == 2){
                        strUser = "paper";
                        result = "You won";
                        win++;
                    }
                    break;
                case 2:
                    strCom = "paper";
                    if(user == 0){
                        strUser = "scissor";
                        result = "You lose";
                        win++;
                    }else if (user == 1){
                        strUser = "rock";
                        result = "You won";
                        win++;
                    }else if (user == 2){
                        strUser = "paper too";
                        result = "It is a draw";
                    }
                    break;
                }

                System.out.println("The computer is " + strCom + ". You are " + strUser + ". " + result + ".");

            }else {
                System.out.println("This is a wrong number.");
            }
                    }
    }
}
