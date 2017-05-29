import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
        String url = "https://api.vk.com/method";
        String method = "/friends.get";

        String userId = "user_id=" + 176050764;
        int count  = 10;
        String fields = "fields=photo_100,domain";

        String expandUrl = url + method + "?" + userId + "&count" + count +
                "&" + fields;

        RestTemplate template = new RestTemplate();
        String response = template.getForObject(expandUrl, String .class);
        System.out.println(response);
    }
}
