/**
 *@author Armando Alvear - 0254934
 *Software Engineering
 *CSCI 3340-02 - Spring 2018
 *Project 03 - PARKING CITATION MVC
 */
package ticket;

public class Ticket {
    
    //Ticket class attributes
    private int ticketNum;
    private String licenseNum;
    private String state;
    private String permitNum;
    private String make;
    private String color;
    private String reason;
    private String date;
    private String time;
    private String location;
    private String issuedBy;
    private String info;

    //Constructor - Empty
    public Ticket() {
    }
    
    //Constructor - All
    public Ticket(int ticketNum, String licenseNum, String state, String permitNum, String make, String color, String reason, String date, String time, String location, String issuedBy, String info) {
        this.ticketNum = ticketNum;
        this.licenseNum = licenseNum;
        this.state = state;
        this.permitNum = permitNum;
        this.make = make;
        this.color = color;
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.location = location;
        this.issuedBy = issuedBy;
        this.info = info;
    }
    
    //Accessors and Mutators - All
    /**
     * @return the ticketNum
     */
    public int getTicketNum() {
        return ticketNum;
    }

    /**
     * @param ticketNum the ticketNum to set
     */
    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    /**
     * @return the licenseNum
     */
    public String getLicenseNum() {
        return licenseNum;
    }

    /**
     * @param licenseNum the licenseNum to set
     */
    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the permitNum
     */
    public String getPermitNum() {
        return permitNum;
    }

    /**
     * @param permitNum the permitNum to set
     */
    public void setPermitNum(String permitNum) {
        this.permitNum = permitNum;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the issuedBy
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * @param issuedBy the issuedBy to set
     */
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
