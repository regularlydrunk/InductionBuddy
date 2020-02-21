package com.mmu.ac.uk.induction;
// https://www.skiddle.com/api/v1/events/search/?api_key=bbf677d36ce7b7b7c67b27e51b56e4e8&latitude=53.4839&longitude=-2.2446&radius=5&eventcode=LIVE&order=distance&description=1
// https://www.skiddle.com/api/v1/venues/

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SkiddleAPI {

    public static String EventSearch() {
        String APISkiddle = "bbf677d36ce7b7b7c67b27e51b56e4e8";

        String EventAPIEndpoint = "https://www.skiddle.com/api/v1/events/search/?api_key=" + APISkiddle + "&latitude=53.4839&longitude=-2.2446&radius=5&eventcode=LIVE&order=distance&description=1";
        String eventJsonRequest = MakeRequest(EventAPIEndpoint);
        final String eventJsonResponse = eventJsonRequest;
        return eventJsonResponse;

    }

    public static String VenueSearch() {
        String APISkiddle = "bbf677d36ce7b7b7c67b27e51b56e4e8";

        String VenueAPIEndpoint = "https://www.skiddle.com/api/v1/venues/?api_key=" + APISkiddle + "&latitude=53.4839&longitude=-2.2446&radius=5&eventcode=LIVE&order=distance&description=1";
        String VenueJsonRequest = MakeRequest(VenueAPIEndpoint);
        String VenueJsonResponse = VenueJsonRequest;
        return VenueJsonResponse;

    }

    public void EventsDataParser() {

        String jsonResponse = VenueSearch();

        JSONArray results = null;
        try {
            results = new JSONArray(jsonResponse);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < results.length(); i++) {
            // results -> (parse) eventname, address, postcode, phone,latitude, longitude, startdate, enddate
            try {
                String eventname = results.getJSONObject(i).optString("eventname");
                String address = results.getJSONObject(i).optString("address");
                String postcode = results.getJSONObject(i).optString("postcode");
                int phone = results.getJSONObject(i).optInt("phone");
                String latitude = results.getJSONObject(i).optString("latitude");
                String longitude = results.getJSONObject(i).optString("longitude");
                String startdate = results.getJSONObject(i).optString("startdate");
                String enddate = results.getJSONObject(i).optString("enddate");

                SkiddleEvents skiddleEvents = new SkiddleEvents(eventname, address, postcode, phone, latitude, longitude, startdate, enddate);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public static String MakeRequest(String APIURL) {
        URL url;
        HttpURLConnection conn;
        BufferedReader rd;

        String fullURL = APIURL;
        System.out.println("Getting Data from : "+fullURL);  // DEBUG confirmation message
        String line;
        String result = "";
        try {
            url = new URL(fullURL);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            // Request response from server to enable URL to be opened
            while ((line = rd.readLine()) != null) {
                result += line;
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
