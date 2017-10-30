package view.dynamic;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public abstract class ImageObject {

	///get screen's dimensions
	private double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	private double ratio = screenWidth/screenHeight;
	
	//set the image's dimensions
	private int imgWidth;
	private int imgHeight;
	
	//number of images
	private int frameCount;
	private int picNum = 0;
	
	//2D array for the images
	private BufferedImage[][] pics;
	
	//****************************
	//Methods
	public double getScreenWidth(){
		return screenWidth;
	}
	public double getScreenHeight(){
		return screenHeight;
	}
	public double getRatio(){
		return (screenWidth/screenHeight);
	}
	
	//getter for the image dimensions
	public int getWidth(){
		return imgWidth;
	}
	public int getHeight(){
		return imgHeight;
	}
	
	//setter for the image dimensions
	public void setWidth(int width){
		imgWidth = width;
	}
	public void setHeight(int height){
		imgHeight = height;
	}
	
	//getter and setter frameCount
	public int getFrameCount(){
		return frameCount;
	}
	public void setFrameCount(int i){
		frameCount = i;
	}
	
	//getter and setter picNum
	public int getPicNum(){
		return picNum;
	}
	public void setPicNum(int num){
		picNum = num;
	}
	
	//setter for the pic 2D array
	public void setPicsArray(int rows){
		pics = new BufferedImage[rows][frameCount];
	}
	
	//setter for elements into the array
	public void setImage(int row, int col, BufferedImage img){
		pics[row][col] = img;
	}
}
