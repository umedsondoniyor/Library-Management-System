package library.assistant.ui.main.toolbar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import library.assistant.util.LibraryAssistantUtil;

public class ToolbarController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadAddMember(ActionEvent event) {
        LibraryAssistantUtil.loadWindow(getClass().getResource("/library/assistant/ui/addmember/member_add.fxml"), "Yeni Uye Ekle", null);
    }

    @FXML
    private void loadAddBook(ActionEvent event) {
        LibraryAssistantUtil.loadWindow(getClass().getResource("/library/assistant/ui/addbook/add_book.fxml"), "Yeni Kitab Ekle", null);
    }

    @FXML
    private void loadMemberTable(ActionEvent event) {
        LibraryAssistantUtil.loadWindow(getClass().getResource("/library/assistant/ui/listmember/member_list.fxml"), "Uye Listesi", null);
    }

    @FXML
    private void loadBookTable(ActionEvent event) {
        LibraryAssistantUtil.loadWindow(getClass().getResource("/library/assistant/ui/listbook/book_list.fxml"), "Kitab Listesi", null);
    }

    @FXML
    private void loadSettings(ActionEvent event) {
        LibraryAssistantUtil.loadWindow(getClass().getResource("/library/assistant/settings/settings.fxml"), "Ayarlar", null);
    }
    
}
