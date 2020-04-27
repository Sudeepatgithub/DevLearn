package misc;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStripe {
    public static void main(String[] args) {
        rules_engine("[ \"CHARGE: card_country=US&currency=USD&amount=150&ip_country=CA\",\"ALLOW: amount < 100\", \"BLOCK: card_country != ip_country AND amount > 100\", ]");
    }

    public static int rules_engine(String charge) {
        charge = charge.substring(1,charge.length()-1).trim();
        System.out.println(charge);
        HashMap<String,String> chargeMap = new HashMap<>(5);
        HashMap<String,String> allowMap;
        HashMap<String,String> blockMap;
        String brokenString[] = charge.split(",");
        String chargeString = brokenString[0];
        // (=\w*)
        Pattern patternKey = Pattern.compile("([a-z_]*=)");
        Pattern patternValue= Pattern.compile("(=\\w*)");
        Matcher matcherKey = patternKey.matcher(chargeString);
        Matcher matcherValue = patternValue.matcher(chargeString);
        int count =0;
        while (matcherKey.find()&&matcherValue.find() && count<=matcherKey.groupCount()){
            String key = matcherKey.group(count);
            String value = matcherValue.group(count++);
            chargeMap.put(key.substring(0,key.length()-1),value.substring(1,value.length()));
        }
        System.out.println(chargeMap);
        if(brokenString.length == 3) {
            String whichOne = brokenString[1].substring(1,brokenString[1].length()-1);

        }
        return 1;
    }
}
