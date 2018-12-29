//personal project experiment 
import java.util.ArrayList;

public class Board 
{
	private Tile[] board;
	private int rows;
	private int cols;
	private int remaining; tiles remaining to be clicked 
	private int mines;
	
	public Board(int rows, int cols, int numMines)
	{
		board = new Tile[rows][cols];
		this.rows = rows;
		this.cols = cols;
		mines = numMines;
		remaining = rows*cols - numMines;
	}
	public Board(String difficulty)
	{
		if (difficulty.toLowerCase().equals("easy"))
		{
			board = new Tile[8][8];
			rows = 8;
			cols = 8;
			mines = 10;
			remaining = 54;
		}
		else if (difficulty.toLowerCase().equals("medium"))
		{
			board = new Tile[16][16];
			rows = 16;
			cols = 16;
			mines = 40;
			remaining = 16*16 - 40;
		}
		else if (difficulty.toLowerCase().equals("hard"))
		{
			board = new Tile[16][30];
			rows = 16;
			cols = 30;
			mines = 99;
			remaining = 16*30 - 99;
		}
	}
	
	public void setMines(int firstClick) //will figure out how to get the firstclick later 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < rows * cols; i++)
		{
			list.add(i);
		}
		int count = mines;
		while (count > 0)
		{
			int index = (int) (Math.random() * list.size());
			board[index / cols][index % cols].
		}
	}
}
