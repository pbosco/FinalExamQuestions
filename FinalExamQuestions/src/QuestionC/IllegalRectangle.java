package QuestionC;

public class IllegalRectangle extends Exception {
	

		public void IllegalRectangleException(int newx, int newy){
	
	if( newx <= 0){
		System.out.println("Illegal Rectangle with" + newx + "and" + newy);
		
	}
	else if (newy <= 0){
		System.out.println("Illegal Rectangle with" + newx + "and" + newy);
	}

}
}
