package ru.itis.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import ru.itis.vk.api.VkApiRestTemplate;
import ru.itis.vk.models.Friend;
import ru.itis.vk.models.Friends;

import java.util.List;

public class MainController {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    public void initialize() {
        VkApiRestTemplate vkApi = new VkApiRestTemplate();
        List<Friend> friends =
                vkApi.getFriends(176050764,10, "domain", "sex", "photo_200_orig", "online");

        double lastY = 0;
        Pane pane = new Pane();
        scrollPane.setPannable(true);
        for (Friend friend : friends) {
            ImageView imageView = new ImageView(friend.getPhoto());
            imageView.setY(lastY);
            lastY = lastY + imageView.getImage().getHeight() + 5;
            pane.getChildren().add(imageView);
        }
        scrollPane.setContent(pane);
    }
}
