package utilities;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailUtility extends BaseClass {
	
	
	public static void sendEmail(String filename) {
		// Create object of Property file
		  Properties props = new Properties();
		  props.put("mail.smtp.host", "smtp.gmail.com");
		  props.put("mail.smtp.socketFactory.port", "465");
		  props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		  props.put("mail.smtp.auth", "true");
		  props.put("mail.smtp.port", "465");
		
		  // This will handle the complete authentication   https://myaccount.google.com/lesssecureapps  for less secure app turn on
		  Session session = Session.getDefaultInstance(props,
		
			new javax.mail.Authenticator() {
		
		 	protected PasswordAuthentication getPasswordAuthentication() {
		
		 	return new PasswordAuthentication("USERnAME", "pASSWORD");
		
		 	}
		
			});
		
		  try {
		
		   // Create object of MimeMessage class
		   Message message = new MimeMessage(session);
		   message.setFrom(new InternetAddress("priyathakral86@gmail.com"));
		   message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("pthakral27@gmail.com"));
		 
		   message.setSubject("Testing Subject");
		
		   // Create object to add multimedia type content
		   BodyPart messageBodyPart1 = new MimeBodyPart();
		   messageBodyPart1.setText("This is message body");
		
		   // Create another object to add another content
		   MimeBodyPart messageBodyPart2 = new MimeBodyPart();
		   
		
		   // Create data source and pass the filename
		   DataSource source = new FileDataSource(filename);
		
		   // set the handler
		   messageBodyPart2.setDataHandler(new DataHandler(source));
		
		   // set the file
		   messageBodyPart2.setFileName(filename);
		
		   // Create object of MimeMultipart class
		   Multipart multipart = new MimeMultipart();
		
		   // add body part 1
		   multipart.addBodyPart(messageBodyPart2);
		
		   // add body part 2
		   multipart.addBodyPart(messageBodyPart1);
		
		   // set the content
		   message.setContent(multipart);
		
		   // finally send the email
		   Transport.send(message);
		
		   System.out.println("=====Email Sent=====");
		
		  } catch (MessagingException e) {
		
		   throw new RuntimeException(e);
		
		  }
	}


}
