package AbtractionExample;

abstract class StrictParent {
	abstract void doWalk();
	abstract void goForStudy();
	
	void goToSleep() {
		System.out.println("I am a Strict Parent, My Order to all Child is go for sleep at 12 AM Max");
	}
}
