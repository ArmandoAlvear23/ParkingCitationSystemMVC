/**
 *@author Armando Alvear - 0254934
 *Software Engineering
 *CSCI 3340-02 - Spring 2018
 *Project 03 - PARKING CITATION MVC
 */

package ticket;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class TicketView extends GridPane {
    
    //Form
    private Label licenseNumLabel = new Label("License number:");
    private TextField licenseNumTF = new TextField();
    
    private Label stateLabel = new Label("State:");
    private TextField stateTF = new TextField();
    
    private Label permitNumLabel = new Label("Permit number:");
    private TextField permitNumTF = new TextField();
    
    private Label makeLabel = new Label("Vehicle make/model");
    private TextField makeTF = new TextField();
    
    private Label colorLabel = new Label("Color:");
    private TextField colorTF = new TextField();
    
    private Label reasonLabel = new Label("Reason:");
    private TextField reasonTF = new TextField();
    
    private Label dateLabel = new Label("Date:");
    private TextField dateTF = new TextField();
    
    private Label timeLabel = new Label("Time:");
    private TextField timeTF = new TextField();
    
    private Label locationLabel = new Label("Location:");
    private TextField locationTF = new TextField();
    
    private Label issuedByLabel = new Label("Issued by:");
    private TextField issuedByTF = new TextField();
    
    //Text Area
    private Label textArea1Label = new Label("Show All: ");
    private TextArea allTicketsTA = new TextArea();
    
    //Buttons
    private Button submitBtn = new Button("Submit");
    private Button viewBtn = new Button("View last");
    private Button viewAllBtn = new Button("View All");

    //Constructor
    public TicketView() {
        
        this.addRow(0, licenseNumLabel, licenseNumTF);
        this.addRow(1, stateLabel, stateTF);
        this.addRow(2, permitNumLabel, permitNumTF);
        this.addRow(3, makeLabel, makeTF);
        this.addRow(4, colorLabel, colorLabel);
        this.addRow(5, reasonLabel, reasonTF);
        this.addRow(6, dateLabel, dateTF);
        this.addRow(7, timeLabel, timeTF);
        this.addRow(8, locationLabel, locationTF);
        this.addRow(9, issuedByLabel, issuedByTF);
        
        this.addRow(10, submitBtn);
        this.addRow(11, viewBtn);
        this.addRow(12, viewAllBtn);
        
    }
    
    //Function #1 - updates ticket view
    public void updateTicketView(Ticket currentTicket){
        
        //Declare variables and get info from currentTicket
        String licenseNum = currentTicket.getLicenseNum();
        String state = currentTicket.getState();
        String permitNum = currentTicket.getPermitNum();
        String make = currentTicket.getMake();
        String color = currentTicket.getColor();
        String reason = currentTicket.getReason();
        String date = currentTicket.getDate();
        String time = currentTicket.getTime();
        String location = currentTicket.getLocation();
        String issuedBy = currentTicket.getIssuedBy();
        
        //Clears textfields
        this.getChildren().clear();
        
        //Sets Labels and gets currentTicket info and sets it inside TextFields
        this.addRow(0, licenseNumLabel, licenseNumTF);
        licenseNumTF.setText(licenseNum);
        
        this.addRow(1, stateLabel, stateTF);
        stateTF.setText(state);
        
        this.addRow(2, permitNumLabel, permitNumTF);
        permitNumTF.setText(permitNum);
        
        this.addRow(3, makeLabel, makeTF);
        makeTF.setText(make);
        
        this.addRow(4, colorLabel, colorLabel);
        colorTF.setText(color);
        
        this.addRow(5, reasonLabel, reasonTF);
        reasonTF.setText(reason);
        
        this.addRow(6, dateLabel, dateTF);
        dateTF.setText(date);
        
        this.addRow(7, timeLabel, timeTF);
        timeTF.setText(time);
        
        this.addRow(8, locationLabel, locationTF);
        locationTF.setText(location);
        
        this.addRow(9, issuedByLabel, issuedByTF);
        issuedByTF.setText(issuedBy);
        
        //Buttons
        this.addRow(10, submitBtn);
        this.addRow(11, viewBtn);
        this.addRow(12, viewAllBtn);
    
    }
    
    //Function #2
    public void updateTicketViewAll(ArrayList<Ticket> allTickets){
        
        String licenseNum = "";
        String state = "";
        String permitNum = "";
        String make = "";
        String color = "";
        String reason = "";
        String date = "";
        String time = "";
        String location = "";
        String issuedBy = "";
        
        String alltickets = "";
        
        for (int i = 0; i < allTickets.size(); i++){
            
            Ticket currentTicket = (Ticket) allTickets.get(i);
            
            licenseNum = currentTicket.getLicenseNum();
            state = currentTicket.getState();
            permitNum = currentTicket.getPermitNum();
            make = currentTicket.getMake();
            color = currentTicket.getColor();
            reason = currentTicket.getReason();
            date = currentTicket.getDate();
            time = currentTicket.getTime();
            location = currentTicket.getLocation();
            issuedBy = currentTicket.getIssuedBy();
            
            alltickets += 
                        "License Number: " + licenseNum +
                        "\nState: " + state +
                        "\nPermit Number: " + permitNum +
                        "\nMake: " + make +
                        "\nColor: " + color +
                        "\nReason: " + reason +   
                        "\nDate: " + date +
                        "\nTime: " + time +
                        "\nLocation: " + location +
                        "\nIssued by: " + issuedBy + "\n\n";
        }
        
        this.getChildren().clear();
        
        this.addRow(0, licenseNumLabel, licenseNumTF);
        this.addRow(1, stateLabel, stateTF);
        this.addRow(2, permitNumLabel, permitNumTF);
        this.addRow(3, makeLabel, makeTF);
        this.addRow(4, colorLabel, colorLabel);
        this.addRow(5, reasonLabel, reasonTF);
        this.addRow(6, dateLabel, dateTF);
        this.addRow(7, timeLabel, timeTF);
        this.addRow(8, locationLabel, locationTF);
        this.addRow(9, issuedByLabel, issuedByTF);
        
        this.addRow(10, submitBtn);
        this.addRow(11, viewBtn);
        this.addRow(12, viewAllBtn);
        
        allTicketsTA.setText(alltickets);
        this.addRow(13, allTicketsTA);
    }

    /**
     * @return the licenseNumLabel
     */
    public Label getLicenseNumLabel() {
        return licenseNumLabel;
    }

    /**
     * @param licenseNumLabel the licenseNumLabel to set
     */
    public void setLicenseNumLabel(Label licenseNumLabel) {
        this.licenseNumLabel = licenseNumLabel;
    }

    /**
     * @return the licenseNumTF
     */
    public TextField getLicenseNumTF() {
        return licenseNumTF;
    }

    /**
     * @param licenseNumTF the licenseNumTF to set
     */
    public void setLicenseNumTF(TextField licenseNumTF) {
        this.licenseNumTF = licenseNumTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the permitNumLabel
     */
    public Label getPermitNumLabel() {
        return permitNumLabel;
    }

    /**
     * @param permitNumLabel the permitNumLabel to set
     */
    public void setPermitNumLabel(Label permitNumLabel) {
        this.permitNumLabel = permitNumLabel;
    }

    /**
     * @return the permitNumTF
     */
    public TextField getPermitNumTF() {
        return permitNumTF;
    }

    /**
     * @param permitNumTF the permitNumTF to set
     */
    public void setPermitNumTF(TextField permitNumTF) {
        this.permitNumTF = permitNumTF;
    }

    /**
     * @return the makeLabel
     */
    public Label getMakeLabel() {
        return makeLabel;
    }

    /**
     * @param makeLabel the makeLabel to set
     */
    public void setMakeLabel(Label makeLabel) {
        this.makeLabel = makeLabel;
    }

    /**
     * @return the makeTF
     */
    public TextField getMakeTF() {
        return makeTF;
    }

    /**
     * @param makeTF the makeTF to set
     */
    public void setMakeTF(TextField makeTF) {
        this.makeTF = makeTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel() {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the reasonLabel
     */
    public Label getReasonLabel() {
        return reasonLabel;
    }

    /**
     * @param reasonLabel the reasonLabel to set
     */
    public void setReasonLabel(Label reasonLabel) {
        this.reasonLabel = reasonLabel;
    }

    /**
     * @return the reasonTF
     */
    public TextField getReasonTF() {
        return reasonTF;
    }

    /**
     * @param reasonTF the reasonTF to set
     */
    public void setReasonTF(TextField reasonTF) {
        this.reasonTF = reasonTF;
    }

    /**
     * @return the dateLabel
     */
    public Label getDateLabel() {
        return dateLabel;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(Label dateLabel) {
        this.dateLabel = dateLabel;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF() {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel() {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel() {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the issuedByLabel
     */
    public Label getIssuedByLabel() {
        return issuedByLabel;
    }

    /**
     * @param issuedByLabel the issuedByLabel to set
     */
    public void setIssuedByLabel(Label issuedByLabel) {
        this.issuedByLabel = issuedByLabel;
    }

    /**
     * @return the issuedByTF
     */
    public TextField getIssuedByTF() {
        return issuedByTF;
    }

    /**
     * @param issuedByTF the issuedByTF to set
     */
    public void setIssuedByTF(TextField issuedByTF) {
        this.issuedByTF = issuedByTF;
    }

    /**
     * @return the textArea1Label
     */
    public Label getTextArea1Label() {
        return textArea1Label;
    }

    /**
     * @param textArea1Label the textArea1Label to set
     */
    public void setTextArea1Label(Label textArea1Label) {
        this.textArea1Label = textArea1Label;
    }

    /**
     * @return the allTicketsTA
     */
    public TextArea getAllTicketsTA() {
        return allTicketsTA;
    }

    /**
     * @param allTicketsTA the allTicketsTA to set
     */
    public void setAllTicketsTA(TextArea allTicketsTA) {
        this.allTicketsTA = allTicketsTA;
    }

    /**
     * @return the submitBtn
     */
    public Button getSubmitBtn() {
        return submitBtn;
    }

    /**
     * @param submitBtn the submitBtn to set
     */
    public void setSubmitBtn(Button submitBtn) {
        this.submitBtn = submitBtn;
    }

    /**
     * @return the viewBtn
     */
    public Button getViewBtn() {
        return viewBtn;
    }

    /**
     * @param viewBtn the viewBtn to set
     */
    public void setViewBtn(Button viewBtn) {
        this.viewBtn = viewBtn;
    }

    /**
     * @return the viewAllBtn
     */
    public Button getViewAllBtn() {
        return viewAllBtn;
    }

    /**
     * @param viewAllBtn the viewAllBtn to set
     */
    public void setViewAllBtn(Button viewAllBtn) {
        this.viewAllBtn = viewAllBtn;
    }
    
    
    
    
    
    
    
    
    
}
