package ru.itis;

import org.springframework.web.client.RestTemplate;

public class VkApiRestTemplate {

    private final String BASE_URL = "https://api.vk.com/method";
    private final String GET_FRIENDS = "/friends.get";

    private RestTemplate template;

    public VkApiRestTemplate() {
        this.template = new RestTemplate();
    }

    public String getFriends(int userId, int count, String ... fields) {
        String expandedUrl = BASE_URL + GET_FRIENDS +
                "?user_id=" + userId + "&count=" + count ;

        expandedUrl = expandedUrl + "&fields=";
        for (String field : fields) {
            expandedUrl = expandedUrl + field + ",";
        }

        return template.getForObject(expandedUrl, String.class);
    }
}
