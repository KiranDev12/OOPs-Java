// Program to find area of the circle

import java.util.*;
import java.lang.Math;

class Circle{
	private float radius;
	void getRadius(float r){
		radius = r;	
	}
	float returnRadius(){
		return radius;
	}
}

class AreaOfCircle{
	public static void main(String Args[]){
		float area;
		Circle cir1 = new Circle();
		cir1.getRadius(1.5f);
		area = (float)(22/7.0*Math.pow(cir1.returnRadius(), 2));
		System.out.println("Area = "+area);
	}
}