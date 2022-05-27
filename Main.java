import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(11, "Nkusi Thibaut", "Debit", "20000","0.5"));
        accList.add(new Account(12, "Safari Bright", "Credit", "30000","0.2"));
        accList.add(new Account(13, "Mwiza Divine", "Checking", "20000","0.4"));
        accList.add(new Account(14, "Mukesha Desire", "Saving", "20000","0.3"));
        accList.add(new Account(15, "Bikora Boris", "Checking", "20000","0.1"));
        accList.add(new Account(16, "Barabara Stone", "Debit", "20000","0.8"));
        accList.add(new Account(17, "Nishimwe Lucas", "Credit", "20000","0.6"));
        accList.add(new Account(18, "Bigira Darcy", "Debit", "20000","0.9"));
        accList.add(new Account(19, "Ngabiro Inno", "Saving", "20000","0.5"));
        accList.add(new Account(20, "Ndanzako Gabiro", "Checking", "20000","0.7"));


        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}