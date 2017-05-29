package ru.itis.vk.api;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.itis.vk.models.Friend;
import ru.itis.vk.models.Friends;

import java.util.ArrayList;
import java.util.List;

public class VkApiRestTemplate {

    private final String BASE_URL = "https://api.vk.com/method";
    private final String GET_FRIENDS = "/friends.get";

    private RestTemplate template;

    public VkApiRestTemplate() {
        this.template = new RestTemplate();
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        converters.add(new MappingJackson2HttpMessageConverter());
        template.setMessageConverters(converters);
    }

    public List<Friend> getFriends(int userId, int count, String ... fields) {
        String expandedUrl = BASE_URL + GET_FRIENDS +
                "?user_id=" + userId + "&count=" + count ;

        expandedUrl = expandedUrl + "&fields=";
        for (String field : fields) {
            expandedUrl = expandedUrl + field + ",";
        }
        Friends friends = template.getForObject(expandedUrl, Friends.class);
        return friends.getResponse();
    }
}
