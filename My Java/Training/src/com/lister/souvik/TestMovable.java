package com.lister.souvik;
import java.util.Scanner;

interface Movable{
	 void moveUp(); 
	 void moveDown();
	 void moveLeft();
	 void moveRight(); 
}
class MovablePoint implements Movable{
	 int x;
	 int y;
	 MovablePoint(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 public void moveUp(){
		 y++;
	 }
	 public void moveDown(){
		 y--;
	 }
	 public void moveLeft(){
		 x--;
	 }
	 public void moveRight(){
		 x++;
	 }
}
public class TestMovable {
	
}
