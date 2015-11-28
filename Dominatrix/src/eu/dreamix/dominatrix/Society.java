package eu.dreamix.dominatrix;

public interface Society {

	Intellect[] getFirstGeneration();

	Intellect[] makeNewGeneration(PlayerResult[] tournamentResult);
	
}
