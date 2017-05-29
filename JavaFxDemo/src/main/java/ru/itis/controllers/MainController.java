package ru.itis.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.itis.models.CountriesResponse;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML
    private ListView listViewCounties;

    @FXML
    private Button buttonHello;

    @FXML
        private TextField countTextField;

    @FXML
    public void initialize() {
        buttonHello.setOnAction(event -> {
            RestTemplate template = new RestTemplate();
            List<HttpMessageConverter<?>> converters = new ArrayList<>();
            converters.add(new MappingJackson2HttpMessageConverter());
            template.setMessageConverters(converters);
            String count = countTextField.getText();
            CountriesResponse response = template.getForObject("https://api.vk.com/method/database.getCountries?count="
                            + count,
                    CountriesResponse.class);
            listViewCounties.getItems().clear();
            for (int i = 0; i < response.getResponse().size(); i++){
                listViewCounties.getItems().addAll(response.getResponse().get(i).getTitle());
            }
        });
    }
}
