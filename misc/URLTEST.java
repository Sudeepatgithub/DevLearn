package misc;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLTEST {
    static String FIRBASE_JOBSEEKER_DYNAMIC_URL =
            "https://r5rx5.app.goo.gl/?link=%s"
                    + "&apn=naukriApp.appModules.login&amv=76&ibi=com.earlysail.naukri&ius=NI://"
                    + "&ifl=https://www.naukri.com&afl=https://www.naukri.com&isi=Z3QQ492P6Z&imv=4.5";
    public static void main(String[] args) {
        try {
            System.out.println(getDynamicChatLink("2345678","3245678"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    private static String getDynamicChatLink(String senderId, String receiverId) throws UnsupportedEncodingException {
        String str = "https://www.naukri.com/auth-for-chat?sender="+senderId+"&receiver="+receiverId;
        str = URLEncoder.encode(str,"UTF-8");
        return String.format(FIRBASE_JOBSEEKER_DYNAMIC_URL, str);
    }
}
