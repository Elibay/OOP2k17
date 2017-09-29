package Problem5;

import java.util.Scanner;

public class Game {
	static void clear () {
		for (int i = 0; i < 50; ++i) System.out.println();
	}
	static void print ()
	{
		for (int i = 1; i <= 8; ++ i)
		{
			System.out.print(i);
			System.out.print("|");
			for (int j = 1; j <= 8; ++ j)
			{
				if (Main.u[i][j] == null)
					System.out.print (" ");
				else 
					System.out.print(Main.u[i][j].mean);
			}
			System.out.println("|");
		}
		System.out.print("  ");
		for (int i = 0; i < 8; ++ i)
		{
			char c = (char) (i + 'a');
			System.out.print(c + ".");
		}
		System.out.println();
	}
	static boolean check (int x, int y) {
		int dx[] = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		int dy[] = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		for (int i = 0; i < 9; ++ i)
		{
			int X = x + dx[i];
			int Y = y + dy[i];
			if (Main.u[x][y].canMove(X, Y))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Main.addPK ();
		Main.addQK ();
		Main.addRE ();
		
		char hod = 'w'; 
		int shakhW = 0;
		int shakhB = 0;
		int kwx = 1, kwy = 5;
		int kbx = 8, kby = 5;
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			print ();
			String a = sc.next ();
			String b = sc.next ();
			Position p = new Position (a);
			Position to = new Position (b);
			clear();
			if (Main.u[p.x][p.y] == null)
				continue;
			if (shakhB == 1 && p.x != kbx && p.y != kby)
				continue;
			if (shakhW == 1 && p.x != kwx && p.y != kwy)
				continue;
			
			if (Main.u[p.x][p.y].canMove(to.x, to.y) && hod == Main.u[p.x][p.y].color) {
				System.out.println("Can Move");
				Main.u[p.x][p.y].move(to.x, to.y);
				if (hod == 'w' && Main.u[to.x][to.y].canMove(kbx, kby))
				{
					if (check (kbx, kby))
						System.out.print("Checkmate whites win");
					else 
						shakhB = 1;
				}
				else if (hod == 'w')
					shakhB = 0;
				else if (hod == 'b' && Main.u[to.x][to.y].canMove(kwx, kwy))
				{
					if (check (kwx, kwy))
						System.out.print("Checkmate black win");
					else 
						shakhW = 1;
				}
				else
					shakhW = 0;
				if (hod == 'w')
					hod = 'b';
				else
					hod = 'w';
				if (p.x == kwx && p.y == kwy) {
					kwx = to.x; kwy = to.y;
				}
				if (p.x == kbx && p.y == kby) {
					kbx = to.x; kby = to.y;
				}
					
			}
			else {
				System.out.println("You can't move " + Main.u[p.x][p.y].mean);
			}
				
		}
	}
}
