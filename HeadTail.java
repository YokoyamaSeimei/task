import java.util.Random;
import java.util.Scanner;
public class HeadTail{
    public static void main(String[] args) {
        int count=0;
        int count2=0;
        System.out.printf("who are you?\n");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("Hello. "+str+"!\n");
        System.out.printf("Tossing a coin...\n");
        for(int i=1;i<4;i++){
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        int headtail = randomNumber%2;
        if(headtail==0){
        System.out.printf("Round %d : Heads\n",i);
        count++;}
        else {System.out.printf("Round %d : Tails\n",i);
        count2++;
        }
        }
        System.out.printf("Heads: %d , Tails: %d\n",count,count2);
        if(count>count2)
        {
            System.out.printf("You won!\n");
        }
        else{
            System.out.printf("You lose!\n");
        }
    }
}