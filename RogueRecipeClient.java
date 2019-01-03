package ss.week7.recipeserver;

public class RogueRecipeClient extends RecipeClient
{
	//Arbitrarily modify values in a database through SQL injection. 
	//private int port;
	RecipeServer copyRecipeServer;
	public RogueRecipeClient(RecipeServer recipeServer)
	{
		copyRecipeServer=recipeServer;
	}
	
}
