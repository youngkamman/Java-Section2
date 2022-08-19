import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = 0;
        int places = 0;
        int karma =0;


    
        System.out.println("\nKamerron left the house and made $15000");
         money += 15000;

        System.out.println("\nKamerron hit the club and smaked a bitch about his money she gave him his money");
        places++;
        money += 500;

        System.out.print("\n Kamerron had to hit the office and he met with a group of ceos he closed the deal");
        places++;
        money += 25000000;

        System.out.println("\nKamerron went to  a quiet place to pray and thank god for his success ");
        places++;
        karma += 50;

        System.out.println("\nNow Kamerron heads home to sleep");

        System.out.println("\nKamerron had a good day he made $" + money + " and he visited " + places + " places and had a karma of " + karma);


        System.out.println("\nHow much money do you think he should have made");
        int moneyHeShould = scan.nextInt();

        System.out.println("\nHow many places do you think he should have went to");
        scan.nextLine();
        String placesHeShould = scan.nextLine();

        System.out.println("\nKamerron made $" + money + " and you think he should have made $" + moneyHeShould + "\n Kamerron went to " + places+ "  places and you said " + placesHeShould);

        System.out.println("the money percent between the two "  + (money + moneyHeShould));




        scan.close();


    }
}
