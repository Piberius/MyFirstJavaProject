/**
 * 
 */
/**
 * 
 */
module MyFirstProject {
	requires jakarta.xml.bind;
	
	opens com.main.xml to jakarta.xml.bind;
}