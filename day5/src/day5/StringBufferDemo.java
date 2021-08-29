package day5;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str="Hello!world";
		StringBuffer sb = new StringBuffer(str);
		 System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append("ruok"));
		System.out.println(sb.insert(6,"mynew ") );
		//System.out.println(sb.delete(6,10));
		//System.out.println(sb.reverse());
		}
	}

