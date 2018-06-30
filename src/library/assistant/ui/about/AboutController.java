package library.assistant.ui.about;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import library.assistant.util.LibraryAssistantUtil;

public class AboutController implements Initializable {

    private static final String LINKED_IN = "https://www.linkedin.com/in/umedzhon-izbasarov-263a84b1/";
    private static final String FACEBOOK = "https://www.facebook.com/umedzhon.izbasarov";
    private static final String GITHUB = "https://github.com/umedsondoniyor";
    private static final String TWITTER = "https://twitter.com/Umedboyy";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void loadWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
            handleWebpageLoadException(url);
        }
    }

    private void handleWebpageLoadException(String url) {
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        Stage stage = new Stage();
        Scene scene = new Scene(new StackPane(browser));
        stage.setScene(scene);
        stage.setTitle("UniCoder");
        stage.show();
        LibraryAssistantUtil.setStageIcon(stage);
    }

    @FXML
    private void loadYoutubeChannel(ActionEvent event) {
        loadWebpage(TWITTER);
    }

    @FXML
    private void loadBlog(ActionEvent event) {
        loadWebpage(GITHUB);
    }

    @FXML
    private void loadLinkedIN(ActionEvent event) {
        loadWebpage(LINKED_IN);
    }

    @FXML
    private void loadFacebook(ActionEvent event) {
        loadWebpage(FACEBOOK);
    }
}
