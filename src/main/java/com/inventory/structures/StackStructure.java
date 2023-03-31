package com.inventory.structures;

public class StackStructure {
	private int max;
	private Object[] items;
	private int count;

	public StackStructure(int max) {
		this.max = max;
		items = new Object[max];
	}
	public void push(Object item) {
		items[++count] = item;
	}
}
