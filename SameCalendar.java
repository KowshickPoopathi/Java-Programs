import java.util.Scanner;
public class samecalendar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int sameyear;
        if( year % 400 == 0){
            sameyear = year + 28;
        }
        else if((year + 28 )% 400 != 0){
            sameyear = year + 40;
        }else if(year % 4 == 0){
            sameyear = year + 28;
        }
        else if(year % 4 == 1){
            sameyear = year + 6;
        }
        else {
            sameyear = year + 11;
        }
        System.out.println(sameyear);
    }    
}