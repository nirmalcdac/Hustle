package Interview;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/*
* bit.ly/hyhyh   =  https://calendar.google.com/calendar/u/0/r?tab=
bit.ly/hyhyt   =  https://calendar.google.com/calendar/u/0/r?tab=mc
bit.ly/hyhtt   =  https://calendar.google.com/calendar/u/0/r?tab=mc


bit.ly/hyhtt   => https://calendar.google.com/calendar/u/0/r?tab=mc
bit.ly/hyhyt   => https://calendar.google.com/calendar/u/0/r?tab=mc


https://calendar.google.com/v1/api/user

map.google.com/hyhy/jjjk


	root

caleder   map

* */
public class ShortUrl {
    public static void main(String[] args) {
        String testUrl = "https://calendar.google.com/v1/api/user";
        shortUrl(testUrl);
    }

    private static void shortUrl(String testUrl) {
        Map<String, String> map = new HashMap<>();
        cleanUrl(testUrl);
        String generatedUrl = "https:tes.sell/"+generateKey(testUrl.trim());
        map.put(generatedUrl, testUrl);

    }

    private static String cleanUrl(String testUrl) {
        // we will put logic to remove - and ? along with all the charactes  making a url invalid
        testUrl.trim();
        return testUrl;
    }

    private static String generateKey(String testUrl) {
        return testUrl.hashCode()+ " "+ Instant.now().hashCode();
    }




}
