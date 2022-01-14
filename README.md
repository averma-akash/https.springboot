# https.springboot
 How to add https in springboot application
 
 STEP 1: Create self signed SSL certificate
 	command to run in command prompt.
 	
 keytool -genkey -alias selfsigned_localhost_sslserver -keyalg RSA -keysize 2048 -validity 700 -keypass changeit -storepass changeit -keystore ssl-server.jks
 
 This will generate the ssl-server.jks keystore file containing our self signed certificates in the directory from where keytool command has been executed.

 To view what is inside this keystore we can again use the keytool -list command as bellow.
 keytool -list -keystore ssl-server.jks
 
 