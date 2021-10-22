package javaOOP;

abstract class P001_abstractClass {
	
	boolean pause; 
	int currentPos; 
	
	abstract void play(int pos); 
	abstract void stop(); 
	
	void play(){
		play(currentPos); 
	}
	void pause(){
		if(pause){
			pause=false; 
			play(currentPos);
		}else{
			pause=true; 
			stop(); 
		}
	}


}

class Play extends P001_abstractClass{
	

	
	void play(int pos){
		System.out.println("play");
	}
	
	void stop(){
		System.out.println("stop");
	}

	
}

class world {
	
	public static void main(String[] args) {
	
		
		Play p = new Play(); 

	}
	
	
}
