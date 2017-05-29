package ru.itis.vk;

import ru.itis.vk.api.VkApiRestTemplate;
import ru.itis.vk.models.Friend;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VkApiRestTemplate vkApi = new VkApiRestTemplate();
        List<Friend> friends = vkApi
                .getFriends(176050764, 10, "domain", "sex", "photo_200_orig", "online");
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }
}
