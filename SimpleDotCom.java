public class SimpleDotCom  {
		int [] locationCells;
		int numOfHits = 0;
public void setLocationCells(int[] locs){
        locationCells = locs;
    }
public String checkYourself(String StringGuess) {
     int guess = Integer.parseInt(StringGuess);
     String result = "miss";
     for (int cell: locationCells)  {
     if (guess == cell) {
     result = "hit";
     numOfHits++;
     break;
     }
     }

     if (numOfHits == locationCells.length)  {
     result = "kill";
}
System.out.println(result);
return result;
}
}



		