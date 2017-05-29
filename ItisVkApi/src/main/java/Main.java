import org.springframework.web.client.RestTemplate;
import ru.itis.VkApiRestTemplate;

public class Main {
    public static void main(String[] args) {
        VkApiRestTemplate vkApi = new VkApiRestTemplate();

        String marselFriends = vkApi.getFriends(176050764, 10, "domain", "sex", "photo_200_orig", "online");
        System.out.println(marselFriends);
    }
}
