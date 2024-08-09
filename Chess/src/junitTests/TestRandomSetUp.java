package junitTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import pieces.Piece;

public class TestRandomSetUp {

	@Test
	public void test_RandomOnKingNotOnIndex0() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> pieces = new ArrayList<String>();
		
		System.out.println("Button Clicked");
		//board = null;
		while(numbers.size() < 8) {
			Random rand = new Random();
			int randomNum = rand.nextInt(8);
			System.out.println(randomNum);
			String pieceName = "";
			if(numbers.contains(randomNum)) {
				System.out.println("It Contains this number:");
			} else {
				switch(randomNum) {
				case 1:
					pieceName = "Rook";
					break;
				case 2:
					pieceName = "Knight";
					break;
				case 3:
					pieceName = "Bishop";
					break;
				case 0:
					pieceName = "King";
					break;
				case 4:
					pieceName = "Queen";
					break;
				case 5:
					pieceName = "Bishop2";
					break;
				case 6:
					pieceName = "Knight2";
					break;
				case 7:
					pieceName = "Rook2";
				}
				
				
				if (pieces.size() == 0 & pieceName == "King") {
					continue;
				} else if((pieces.contains("Rook") || pieces.contains("Rook2")) & !pieces.contains("King") & (pieceName == "Rook" || pieceName == "Rook2")){
					continue;
				} else {
					numbers.add(randomNum);
					pieces.add(pieceName);
				}
				
			}
			if(numbers.size() == 5 & !pieces.contains("King") & !pieces.contains("Rook") & !pieces.contains("Rook2")) {
				System.out.println("Need To Add King and castle");
			}
			if(pieces.size() == 5 & (pieces.contains("Rook") || pieces.contains("Rook2")) & !pieces.contains("King")) {
				numbers.add(0);
				pieces.add("King");
			}
			
			
		}
		
		boolean indexEqual = pieces.get(0) == "King";
		
		
		assertFalse(indexEqual);
	}
	
	@Test
	public void test_RandomOnKingNotOnIndexSeven() {
		

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> pieces = new ArrayList<String>();
		
		System.out.println("Button Clicked");
		//board = null;
		while(numbers.size() < 8) {
			Random rand = new Random();
			int randomNum = rand.nextInt(8);
			System.out.println(randomNum);
			String pieceName = "";
			if(numbers.contains(randomNum)) {
				System.out.println("It Contains this number:");
			} else {
				switch(randomNum) {
				case 1:
					pieceName = "Rook";
					break;
				case 2:
					pieceName = "Knight";
					break;
				case 3:
					pieceName = "Bishop";
					break;
				case 0:
					pieceName = "King";
					break;
				case 4:
					pieceName = "Queen";
					break;
				case 5:
					pieceName = "Bishop2";
					break;
				case 6:
					pieceName = "Knight2";
					break;
				case 7:
					pieceName = "Rook2";
				}
				
				
				if (pieces.size() == 0 & pieceName == "King") {
					continue;
				} else if((pieces.contains("Rook") || pieces.contains("Rook2")) & !pieces.contains("King") & (pieceName == "Rook" || pieceName == "Rook2")){
					continue;
				} else {
					numbers.add(randomNum);
					pieces.add(pieceName);
				}
				
			}
			if(numbers.size() == 5 & !pieces.contains("King") & !pieces.contains("Rook") & !pieces.contains("Rook2")) {
				System.out.println("Need To Add King and castle");
			}
			if(pieces.size() == 5 & (pieces.contains("Rook") || pieces.contains("Rook2")) & !pieces.contains("King")) {
				numbers.add(0);
				pieces.add("King");
			}
			
			
		}
		
		boolean indexEqual = pieces.get(7) == "King";
		
		
		assertFalse(indexEqual);
	}
	

}


