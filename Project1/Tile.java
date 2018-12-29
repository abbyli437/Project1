
public class Tile 
{
	private int adj;
	private boolean isMine;
	private boolean flagged;
	private boolean clicked;
	
	public Tile()
	{
		isMine = false;
		flagged = false;
		clicked = false;
	}
}
