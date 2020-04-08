package Session_16;
import java.util.*;

public class Mid_Stack {

	protected int[] data;
	protected int tos;
	
	public static final int DEFAULT_CAPAPCITY = 10;
	
	public Mid_Stack() throws Exception {
		this(DEFAULT_CAPAPCITY);
	}
	
	public Mid_Stack(int capacity) throws Exception {
		if(capacity < 1){
			throw new Exception("Invalid capacity");
		}
		
		this.data = new int[capacity];
		this.tos = -1;
	}
	
	public int size(){
		return this.tos + 1;
	}
	
	public boolean isEmpty(){
		int currentSize = this.size();
		
		if(currentSize == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int item) throws Exception{
		if(this.size() == this.data.length){
			throw new Exception("Stack is full");
		}
		
		this.tos++;
		this.data[this.tos] = item;
	}
	
	public int pop() throws Exception {
		if(this.isEmpty()){
			throw new Exception("Stack is empty");
		}
		
		int retVal = this.data[this.tos];
		
		this.data[this.tos] = 0;
		this.tos--;
		
		return retVal;
	}
	
	public int top() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Stack is empty");
		}
		
		int retVal = this.data[this.tos];
		return retVal;
	}
	
	public void display(){
		for(int i = this.tos; i >= 0; i--){
			System.out.print(this.data[i] + ", ");
		}
		
		System.out.println("END");
	}
	public static void main(String args[]) throws Exception
	{
		Mid_Stack s = new Mid_Stack();
		s.push(10);
		int n = s.size();
		int mid = n/2;
		for(int i =0; i<s.size(); i++)
		{
			a[i] = s.(1);
		}
		s.display();
	}
}