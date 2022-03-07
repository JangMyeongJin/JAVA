package codeTest;

import java.util.*;

public class Test6 {
	
	static int answerCount=0;
	static ArrayList<Integer> answerSize = new ArrayList<Integer>();
	static int size = 1;
	static int iUpCount = 0;
	static int iDownCount = 0;
	static int jUpCount = 0;
	static int jDownCount = 0;

	public static void main(String[] args) {

		int[][] num1 = {{1,1,0,0,0}, {1,1,0,0,0}, {0,0,0,0,0}, {0,0,1,1,0}, {1,0,1,1,1}};
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				System.out.print(num1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1.length; j++) {
				if(num1[i][j]==1 && i==0 && j==0) {
					answerCount++;
					search(num1,i,j);
					answerSize.add(size);
					size=1;
					iUpCount = iDownCount = jUpCount = jDownCount = 0;
					
				}else if(num1[i][j]==1 && i==0 && j>0 && num1[i][j-1]==0) {
					answerCount++;
					search(num1,i,j);
					answerSize.add(size);
					size=1;
					iUpCount = iDownCount = jUpCount = jDownCount = 0;
					
				}else if(num1[i][j]==1 && i>0 && j==0 && num1[i-1][j]==0) {
					answerCount++;
					search(num1,i,j);
					answerSize.add(size);
					size=1;
					iUpCount = iDownCount = jUpCount = jDownCount = 0;
					
				}else if(num1[i][j]==1 && i>0 && j>0 && j+1<num1.length && num1[i-1][j]==0 && num1[i][j-1]==0 && num1[i+1][j]==1 && num1[i-1][j+1]==0) {
					answerCount++;
					search(num1,i,j);
					answerSize.add(size);
					size=1;
					iUpCount = iDownCount = jUpCount = jDownCount = 0;
				}else if(num1[i][j]==1 && i>0 && j>0 && j+1<num1.length && num1[i-1][j]==0 && num1[i][j-1]==0 && num1[i-1][j+1]==0) {
					answerCount++;
					search(num1,i,j);
					answerSize.add(size);
					size=1;
					iUpCount = iDownCount = jUpCount = jDownCount = 0;
				}else if(num1[i][j]==1 && i==num1.length-1 && j==num1.length-1 && num1[i-1][j]==0 && num1[i][j-1]==0) {
					answerCount++;
					answerSize.add(size);
				}
			}
		}
		System.out.println(answerCount);
		for(int i=0; i<answerSize.size(); i++) {
			System.out.print(answerSize.get(i)+" ");
		}
	}
	
	public static void search(int[][] array,int i, int j) {
		
		if(j+1<array.length && array[i][j+1]==1 && jDownCount==0) {
			size++;
			jUpCount++;
			search(array,i,j+1);
			
		}
		else if(i+1<array.length && array[i+1][j]==1 && iDownCount==0) {
			size++;
			iUpCount++;
			search(array,i+1,j);
			
		}
		else if(j-1>-1 && array[i][j-1]==1 && jUpCount==0) {
			size++;
			jDownCount++;
			search(array,i,j-1);
			
		}
		else if(i-1>-1 && array[i-1][j]==1 && iUpCount==0) {
			size++;
			iDownCount++;
			search(array,i-1,j);

		}
		
	}
}
