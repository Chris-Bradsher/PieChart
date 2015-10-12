package piechart;

public class PollTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PollDisplayPanel votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");
		votingMachine.vote1();
		votingMachine.vote2();
		votingMachine.vote3();
		System.out.println(votingMachine);
		
	}

}
