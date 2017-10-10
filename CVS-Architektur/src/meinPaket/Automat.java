package meinPaket;

public class Automat {
	
	private int zustand;
	private int aktion;
	private char[] code={'M','a','e','y','i','r'};	
	
	private int[][] uebergangsTab=
		{{1,0,0,0,0,0,0},{1,2,2,0,0,0,0},{1,0,0,3,3,0,0},{1,0,4,0,0,0,0},{1,0,0,0,0,0,0}};
	
	private int[][] aktionsTab=   
		{{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,1,0}};	
		
	public int ereignis(char ch){
		
			int token;	
			
			 if(ch==code[0])token=0;
		else if(ch==code[1])token=1;
		else if(ch==code[2])token=2;
		else if(ch==code[3])token=3;
		else if(ch==code[4])token=4;
		else if(ch==code[5])token=5;
		else{token=6;}
			 
		aktion=aktionsTab[zustand][token];
		zustand=uebergangsTab[zustand][token];	
		
	return aktion;}}