package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Show {
	@Value("#{20+20}")
	private int X;
	@Value("#{2+2+3}")
	private int Y;
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	@Override
	public String toString() {
		return "demo [X=" + X + ", Y=" + Y + "]";
	}
	


}
