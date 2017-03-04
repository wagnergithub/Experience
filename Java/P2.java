package start;

public class Secon {
	private int num;
	private int snum;
	public void  printSth(){
		System.out.println("Hello world");
	}
	public void putInt(int adon){
		 num = adon;
	}
	
	public void putIntt(int sdon){
		snum = sdon;
	}
	
	public int addNum(){
		return num+snum; 
	}
	
	public int cutNum(){
		return num - snum;
	}
	
	public int mulNum(){
		return num * snum;
	}
	
	public int deviNum(){
		return num / snum;
	}
	
	public void says0(){
		System.out.println("The result is " + addNum());
	}
	
	public void says1(){
		System.out.println("The result is " + cutNum());
	}
	
	public void says2(){
		System.out.println("The result is " + mulNum());
	}
	
	public void says3(){
		System.out.println("The result is " + deviNum());
	}
}
