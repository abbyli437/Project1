//personal project experiment 
import java.util.ArrayList;

public class Board 
{
	private Tile[] board;
	private int rows;
	private int cols;
	private int remaining; tiles remaining to be clicked 
	private int mines;
	
//	//adding tile class in here to see if it does anything, might uncomment as a last resort 
//	private class Tile 
//	{
//		int adj;
//		boolean isMine;
//		boolean flagged;
//		boolean clicked;
//		
//		public Tile()
//		{
//			isMine = false;
//			flagged = false;
//			clicked = false;
//		}
//	}
	
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
			int location = list.remove(index);
			board[location / cols][location % cols].isMine = true;
			count--;
		}
		//sets up all the locations where there's mines 
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				
			}
		}
	}
	
	private void markMines(int i, int j)
	{
		if (board[i][j].isMine == false) //what's with isMine not being blue?
		{
			if (i == 0)
			{
				if (j == 0) //top left corner 
				{
					if (board[0][1].isMine)
						board[0][1].adj++;
					if (board[1][1].isMine)
						board[1][1].adj++;
					if (board[1][0].isMine)
						board[1][0]++;
				}
				else if (j == rows - 1)
				{
					
				}
				else
				{
					for (int i = 0; i < 2; i++)
					{
						
					}
				}
			}
		}
	}
}
