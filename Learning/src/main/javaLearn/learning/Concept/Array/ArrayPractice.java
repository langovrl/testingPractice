package learning.Concept.Array;

public class ArrayPractice {
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		String[] b = {"Test1","Test2","Test3","Test4","Test5","Test6"};
		for(int i=0;i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		int [][] c = {{11,22,33},{44,55,66,77}};
		for(int i=0;i< c.length;i++){
			for(int j=0;j< c[i].length;j++){
				System.out.println(c[i][j]);
			}
		}
		
		int [][][] d = {{{11,22,33},{44,55,66,77}},{{2,5,7,8},{9,6,5,8},{9,8,5,5}}};
		System.out.println(d[d.length-1][d.length].length);
		System.out.print("{");
		for(int i=0;i< d.length;i++){
			System.out.print("{");
			for(int j=0;j< d[i].length;j++){
				System.out.print("{");
				for(int z=0;z< d[i][j].length;z++){
				System.out.print(d[i][j][z]+" ");
				}
				System.out.print("}");
			}
			System.out.print("}");
		}
		System.out.print("}");		
	}

}
