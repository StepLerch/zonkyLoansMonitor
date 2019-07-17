package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.util.Duration;
import service.LoanManager;

@SuppressWarnings("restriction")
public class MainPaneController implements Initializable {
	final Logger log = Logger.getLogger(MainPaneController.class);
	
	@FXML
	private ListView<String> resultList;
	ObservableList<String> loanList;
	private static final int FIVE_MINUTES = 300000;
	
	public MainPaneController() {

	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// This method need to by overriden (just JavaFx things)
		initTimer();
	}
	@FXML
	/**
	 * Show/update all loans in listView (resultList) when event fired or method called
	 * @param event
	 */
	private void showAll(ActionEvent event) {
		log.info("Loans loaded.");
		List<String> loanRecords = LoanManager.getInstance().getAllLoansAsShortString();
		updateListItems(loanRecords);
	}

	/**
	 * This method populate ListView (resultList) with presented parameter.
	 * @param loanRecordList
	 */
	private void updateListItems(List<String> loanRecordList) {
		if (loanRecordList == null) {
			castErrorDialogue("Unable to load data, see log for more details.");
			return;
		}
		loanList = FXCollections.observableArrayList(loanRecordList);
		this.resultList.setItems(loanList);
	}

	/**
	 * Method for showing error dialogue.
	 * @param msg
	 */
	private void castErrorDialogue(String msg) {
		Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
		alert.showAndWait();
	}
	
    private void initTimer() {
    	showAll(null); //show after start (no delay)
    	Timeline timeline = new Timeline(new KeyFrame(
    	        Duration.millis(FIVE_MINUTES),
    	        ae -> showAll(null)));
    	timeline.setCycleCount(Animation.INDEFINITE);
    	timeline.play();
    }
    
    
}
