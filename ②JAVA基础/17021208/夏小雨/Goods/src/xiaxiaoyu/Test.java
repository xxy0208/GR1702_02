package xiaxiaoyu;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		ArrayList<Shop> arrayList=new ArrayList<Shop>();
		Scanner sc=new Scanner(System.in);
		ShopImplements shopImplements=new ShopImplements();
		shopImplements.help();
		boolean isquit=true;
		
		while (isquit) {
			int key = sc.nextInt();
			switch (key) {
			case 1:

				shopImplements.addgoods(arrayList, sc);
				break;
			case 2:
				shopImplements.infoCommodity(arrayList);
				break;
			case 3:
				shopImplements.stock(arrayList, sc);
				break;
			case 4:
				shopImplements.market(arrayList, sc);
				break;
			case 5:
				isquit=false;
				break;
			default:
				System.out.println("��������ȷ��ָ��");
				break;
			}
		}
		System.out.println("�ݰ�");
	}
}