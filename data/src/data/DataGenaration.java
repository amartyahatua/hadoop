package data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;




public class DataGenaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// transaction_id, customer_id, merchant_id, timestamp, invoice_no, invoice_amount, segment_dept, segment_product

		String[] segment_dept = {"Electronics", "Home", "Fashion", "Books", "Sports"};
		String[] segment_product = {"TV", "Mobile", "Computer", "Table", "Chair", "Sofa", "Shirt", "Pant", "Tie", "TextBook", "AudioBook", "StoryBook", "Ball", "Bat", "Golf"};

		try {
			merchantData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}


	public static void merchantData() throws IOException{

		/*String[] tax_registration = new String [200];
		String[] merchant_name = new String [200];
		String [] mobile_no = new String [200];
		String  []  date = new String[200];
		String[] email = new String [200];
		String[] address = new String [200];
		String[] state = new String [200];
		String[] country = new String [200];
		String[] zip = new String [200];
		String[] description = new String [200];*/
	
		
		ArrayList<String> dataMarchant = new ArrayList<>();
		int elements = 40;
				
		String path = "/home/cloudera/Desktop/comp-3/thaicreate.csv";
		FileWriter writer;
		writer = new FileWriter(path, true);
       
		
		
		for(int i=0; i<elements; i++)
		{	
			dataMarchant = new ArrayList<>();
						
			writer.write(generateTaxRegistration());
			writer.write(",");
			writer.write(generateMerchantName());
			writer.write(",");
			writer.write(generateMobileNumber());
			writer.write(",");
			writer.write(generateRandomDate());
			writer.write(",");
			writer.write(generateEmail());
			writer.write(",");
			writer.write(generateAddress());
			writer.write(",");
			writer.write(generateState());
			writer.write(",");
			writer.write(generateCountry());
			writer.write(",");
			writer.write(generatePincode());
			writer.write(",");
			writer.write(generateDescription());
			writer.write(",");
			writer.write(generateLocaiton());
			writer.write("\r\n");
			
			/*System.out.println(generateTaxRegistration());
			System.out.println(generateMerchantName());
			System.out.println(generateMobileNumber());
			System.out.println(generateRandomDate());
			System.out.println(generateEmail());
			System.out.println(generateAddress());
			System.out.println(generateState());
			System.out.println(generateCountry());
			System.out.println(generatePincode());
			System.out.println(generateDescription());
			System.out.println(generateLocaiton());*/
		}
		System.out.println("Write success!");
		writer.close();
	}

	
	
	private static String generateLocaiton() {
		// TODO Auto-generated method stub
		StringBuffer latlong = new StringBuffer();
		for(int i=0;i<2;i++){
			if(i==0)
				latlong.append(Integer.toString(random(1,9)));
			else
				latlong.append(Integer.toString(random(0,9)));
		}
		latlong.append(".");
		
		for(int i=0;i<2;i++){
			latlong.append(Integer.toString(random(0,9)));
		}
		latlong.append(":");

		for(int i=0;i<2;i++){
			latlong.append(Integer.toString(random(0,9)));
		}
		
		latlong.append(".");
		
		for(int i=0;i<2;i++){
			latlong.append(Integer.toString(random(0,9)));
		}
		
		
		return latlong.toString();
		
	}


	private static String generateDescription() {
		// TODO Auto-generated method stub
		int sizeDescription = randBetween(10, 20);
		StringBuffer description = new StringBuffer();
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for(int i=0; i<sizeDescription; i++)
		{
			description.append(alphabet[random(0,51)]);
		}
		
		return description.toString();
	}


	private static String generatePincode() {
		// TODO Auto-generated method stub
		StringBuffer pincode = new StringBuffer();
		for(int i=0;i<5;i++){	
			if(i==0)
				pincode.append(Integer.toString(random(1, 9)));
			else
				pincode.append(Integer.toString(random(0, 9)));
		}
		
		return pincode.toString();
	}


	private static String generateCountry() {
		// TODO Auto-generated method stub
		String[] country = {"US","GT","IQ","IE","ML","MU","DE"};
		StringBuffer countryName = new StringBuffer();
		
		countryName.append(country[random(0, 6)]);
		
		return countryName.toString();
	}


	private static String generateState() {
		// TODO Auto-generated method stub
		String[] state = {"AL","MT","AK","NE","AZ","NV","AR","NH","CA","NJ","CO","NM","CT","NY","DE","NC","FL","ND","GA","OH","HI","OK","ID","OR","IL","PA","IN","RI","IA","SC","KY","TN","LA","TX","ME","UT","MD","VT","MA","VA","MI","WA","MS","WI","MO","WY"};
		StringBuffer stateName = new StringBuffer();
		
		stateName.append(state[random(0, 45)]);
		
		return stateName.toString();
	}


	private static String generateAddress() {
		// TODO Auto-generated method stub
		StringBuffer address = new StringBuffer();
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for(int i=0;i<4;i++){
			address.append(Integer.toString(random(0, 9)));
		}
		address.append(" ");
		
		for(int j=0;j<5;j++){
			address.append(alphabet[random(0, 51)]);
		}
		
		address.append(" ");
		for(int j=0;j<5;j++){
			address.append(alphabet[random(0, 51)]);
		}
		
		address.append(" ");
		for(int j=0;j<5;j++){
			address.append(alphabet[random(0, 51)]);
		}
		
		return address.toString();

	}

	private static String generateEmail() {
		// TODO Auto-generated method stub
		String[] email = {"@hotmail.com", "@gmail.com", "@yahoo.com"};
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		StringBuffer emailID = new StringBuffer();
		for(int i=0;i<7;i++)
		{
			emailID.append(alphabet[random(0,51)]);
		}
		emailID.append(email[random(0, 3)]);
		return emailID.toString();
	}

	private static String generateMobileNumber() {
		// TODO Auto-generated method stub
		StringBuffer mobileNumber = new StringBuffer();
		
		for(int i=0;i<10;i++)
		{
			if(i==0)
				mobileNumber.append(Integer.toString(random(1,9)));
			else
				mobileNumber.append(Integer.toString(random(0,9)));	
				
		}
		
		return mobileNumber.toString();
	}

	private static String generateMerchantName() {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
							"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		StringBuffer stringMerchantName = new StringBuffer();
		
		int indexGap = random (4,8);
		
		for(int i=0; i<15; i++)
		{
			if(i == indexGap)
				stringMerchantName.append(" ");
			else{
				int indexAl = random(0,51);
				stringMerchantName.append(alphabet[indexAl]);
			}
		}
		
		
		return stringMerchantName.toString();
		
	}

	public static String generateTaxRegistration(){
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		StringBuffer stringBf = new StringBuffer();
		
		
		for(int i=0; i<36; i++)
		{
			int initital = random(0,9);
			
			if(i==8 || i==12 || i==16 || i==20)
			{
				stringBf.append("-");
			}
			else{
				if(initital > 5){
					int indexAl = random(0,25);
					stringBf.append(alphabet[indexAl]);
				}
				else{
					int indexAl = random(0,9);
					stringBf.append(Integer.toString(indexAl));
				}
			}
		}
		
		
			
		return stringBf.toString();
	}
	
	public static String generateRandomDate() {

		GregorianCalendar gc = new GregorianCalendar();
		int year = randBetween(2014, 2017);
		gc.set(gc.YEAR, year);
		int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
		gc.set(gc.DAY_OF_YEAR, dayOfYear);
		String date = gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH) ;
		
		return date;
	}
	
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
		
	
	static int random(int left, int right)
	{
		String rString;
		int R  =(int)( left + (int) (Math.random()*(right - left)));

		return R;

	}
	
}
