public static void public static void main(String[] args) {
	intnumofguesses = 0;
	gamehelper helper = new gamehelper();
	simpledotcom thedotcom = new gamehelper();
	simpledotcom thedotcom = new simpledotcom();
	int randomNum = (int) (math.random() *5);
	int[]locations = {randomNum,randomNum+1,randomNum+2};
	thedotcom.setlocationcells(locations);
	boolean isalive = true;
	while(isalive == true){
		string guess = helper.getuserinput("insira um numero");
		string result = thedotcom.checkYourself(guess);
		numofguess++;
		if (result.equals("kill")) {
			isalive = false;
	system.out.println("voce usou" + numofguess + "palpites");
	}
	}