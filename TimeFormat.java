// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		if((minutes >= 0) && (minutes < 10)){
			String min = "0" + minutes;

			if((hours >= 0) && (hours < 12)){
				System.out.print(hours + ":" + min + " AM");
			}else if((hours > 12) && (hours <= 23)){
				System.out.print(hours - 12 + ":" + min + " PM");
			}else if(hours == 12){
				System.out.println(hours + ":" + min + " PM");
			}else{
				System.out.print("error");
			}
		}else{
			if((hours >= 0) && (hours < 12)){
				System.out.print(hours + ":" + minutes + " AM");
			}else if((hours > 12) && (hours <= 23)){
				System.out.print(hours - 12 + ":" + minutes + " PM");
			}else if(hours == 12){
				System.out.println(hours + ":" + minutes + " PM");
			}else{
				System.out.print("error");
			}
		}
	}
}
