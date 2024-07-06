/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nancy
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
 
public class sendSMS1 {
public String sendSms1() {
try {
// Construct data
String apiKey = "apikey=" + URLEncoder.encode("yourapiKey", "UTF-8");
String message = "&message=" + URLEncoder.encode("This is your message", "UTF-8");
String sender = "&sender=" + URLEncoder.encode("Jims Autos", "UTF-8");
String numbers = "&numbers=" + URLEncoder.encode("7010189449", "UTF-8");
// Send data
String data = "https://api.txtlocal.com/send/?" + apiKey + numbers + message + sender;
URL url = new URL(data);
URLConnection conn = url.openConnection();
conn.setDoOutput(true);
// Get the response
BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
String line;
String sResult="";
while ((line = rd.readLine()) != null) {
// Process line...
sResult=sResult+line+" ";
}
rd.close();
return sResult;
} catch (Exception e) {
System.out.println("Error SMS "+e);
return "Error "+e;
}
}
}
