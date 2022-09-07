package Logic;
import java.util.Iterator;
public class Partterns {
	public static void main(String[] args) {
		Partterns obj = new Partterns();
		obj.SolidSqure(6);
		obj.OutlinedSqure(6);
		obj.SolidTriangle1(6);
		obj.SolidTriangle2(6);
		obj.SolidTriangle3(6);
		obj.SolidTriangle4(6);
		obj.SolidTriangle5(6);
		obj.SolidTriangle6(6);
		obj.SolidTriangle7(6);
		obj.SolidTriangle8(6);
		obj.SolidTriangle9(6);
		obj.SolidTriangle10(6);
		obj.SolidTriangle11(6);
		obj.SolidTriangle12(6);
		obj.SolidTriangle13(6);
		obj.SolidTriangle14(6);
		obj.SolidTriangle15(6);
		obj.SolidTriangle16(6);
		obj.SolidTriangle17(6);
		obj.SolidTriangle18(6);
		obj.SolidTriangle19(6);
		obj.ParallelSqure1(6);
		obj.ParallelSqure2(6);
		obj.Arrow1(6);
		obj.Arrow2(6);
		obj.Arrow3(6);
		obj.Heart1(6,11);
		obj.Heart2(6,11);
	}
	public void Divider() {
		System.out.println("_________________________________________________");
		System.out.println("");
	}
	public void SolidSqure(int n) {
		System.out.println("Pattern No:1");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		this.Divider();
	}
	public void OutlinedSqure(int n) {
		System.out.println("Pattern No:2");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n-1 || j == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle1(int n) {
		System.out.println("Pattern No:3");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle2(int n) {
		System.out.println("Pattern No:4");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle3(int n) {
		System.out.println("Pattern No:5");
		for (int i = n-1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle4(int n) {
		System.out.println("Pattern No:6");
		for (int i = n-1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle5(int n) {
		System.out.println("Pattern No:7");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle6(int n) {
		System.out.println("Pattern No:8");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle7(int n) {
		System.out.println("Pattern No:9");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle8(int n) {
		System.out.println("Pattern No:10");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		this.Divider();
	}
	public void SolidTriangle9(int n) {
		System.out.println("Pattern No:11");
		for (int i = n-1; i >= 0; i--) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle10(int n) {
		System.out.println("Pattern No:12");
		for (int i = n-1; i >= 0; i--) {
			for (int j = 1; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle11(int n) {
		System.out.println("Pattern No:13");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle12(int n) {
		System.out.println("Pattern No:14");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = 1; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle13(int n) {
		System.out.println("Pattern No:15");
		for (int i = n-1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle14(int n) {
		System.out.println("Pattern No:16");
		for (int i = n-1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle15(int n) {
		System.out.println("Pattern No:17");
		for (int i = n-1; i >= 0; i--) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle16(int n) {
		System.out.println("Pattern No:18");
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle17(int n) {
		System.out.println("Pattern No:19");
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle18(int n) {
		System.out.println("Pattern No:20");
		for (int i = n-1; i >= 0; i--) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void SolidTriangle19(int n) {
		System.out.println("Pattern No:21");
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void ParallelSqure1(int n) {
		System.out.println("Pattern No:22");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void ParallelSqure2(int n) {
		System.out.println("Pattern No:23");
		for (int i = n-1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void Arrow1(int n) {
		System.out.println("Pattern No:24");
		for (int i = n-1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void Arrow2(int n) {
		System.out.println("Pattern No:25");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void Arrow3(int n) {
		System.out.println("Pattern No:26");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void Heart1(int a,int b) {
		System.out.println("Pattern No:27");
		for (int i = 0; i < a; i++) {
			for (int j = 1; j < a-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			for (int m = a-i; m >= 2; m--) {
				System.out.print(" ");
			}
			for (int n = 1; n < a-i; n++) {
				System.out.print(" ");
			}
			for (int o = 0; o <= i; o++) {
				System.out.print("*");
			}
			for (int p = 0; p < i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = b-i; k >= 2; k--) {
				System.out.print("*");
			}
			for (int l = 0; l < b-i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.Divider();
	}
	public void Heart2(int a,int b) {
		System.out.println("Pattern No:28");
		for (int i = 0; i < a; i++) {
			for (int j = 1; j < a-i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("* ");
			}
			for (int m = a-i; m >= 2; m--) {
				System.out.print("  ");
			}
			for (int n = 1; n < a-i; n++) {
				System.out.print("  ");
			}
			for (int o = 0; o <= i; o++) {
				System.out.print("* ");
			}
			for (int p = 0; p < i; p++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = b-i; k >= 2; k--) {
				System.out.print("* ");
			}
			for (int l = 0; l < b-i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}