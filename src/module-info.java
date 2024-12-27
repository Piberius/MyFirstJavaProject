/**
 * 
 */
/**
 * 
 */
module MyFirstProject {
	requires jakarta.xml.bind;
	requires java.net.http;
	
	opens com.main.xml to jakarta.xml.bind;
	opens com.main.util to jakarta.xml.bind;
	opens com.main.countryinfo.request to jakarta.xml.bind;
	opens com.main.countryinfo.response to jakarta.xml.bind;
}