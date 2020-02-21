package com.mmu.ac.uk.induction;

public class SkiddleEvents {

    String eventname;
    String address;
    String postcode;
    int phone;
    String latitude;
    String longitude;
    String startdate;
    String enddate;

    public SkiddleEvents(String eventname, String address, String postcode, int phone, String latitude, String longitude, String startdate, String enddate) {
        super();

        this.eventname = eventname;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.startdate = startdate;
        this.enddate = enddate;
        // results -> (parse) eventname, address, postcode, phone,latitude, longitude, startdate, enddate
    }


    public String getEventname() {
        return eventname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getPhone() {
        return phone;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

}
