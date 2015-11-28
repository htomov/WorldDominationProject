package eu.dreamix.dominatrix;

public class Darwin {
	
	private static final int GENERATIONS_BEFORE_SAVE = 10;
	Intellect[] currentPopulation;
	
	
	private void justDoIt(){
		Tournament tournament = ObjectFactory.createTournament();
		Society soc =ObjectFactory.createSociety();
		currentPopulation = soc.getFirstGeneration();
		int generationNumber=0;
		while(true){
			
			
			
			PlayerResult[] tournamentResult = tournament.play(currentPopulation);
			
			//select survivors
			
			generationNumber++;
			//store generation
			
			if(generationNumber % GENERATIONS_BEFORE_SAVE == 0){
				System.out.println(tournamentResult[0].toString());
				return;
			}
			
			//mutation
			Intellect[] newGeneration = soc.makeNewGeneration(tournamentResult);

			
			
		}
	}
}
