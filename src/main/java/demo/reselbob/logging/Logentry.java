package demo.reselbob.logging;

import java.util.Date;
import java.net.InetAddress;
import java.net.UnknownHostException;
import com.google.gson.Gson;


public class Logentry {
	
	private String message = null;
	private Date createTime = null;
	private String loggedBy = null;
	private String ipAddress = null;
	
	/**
	 * The constructor for the utility class to create a log message in
	 * JSON format
	 * 
	 * @param msg , the message for the log entry
	 * @param logBy, the entity or party making the log entry
	 */
	public Logentry(String msg, String logBy) {
		message = msg;
		createTime = new Date();
		loggedBy = logBy;
		try {
			ipAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			ipAddress ="UNKNOWN";
		}
	}
/**
 * @return a log entry in JSON format
 */
	public String toString(){
		Gson gson = new Gson();
		 return gson.toJson(this);
	}
}
