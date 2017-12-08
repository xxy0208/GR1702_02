package xiaxiaoyu;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopImplements implements IShop {

	void help() {
		System.out.println("�̵�ϵͳ");
		System.out.println("1  ������Ʒ");
		System.out.println("2  �ο����");
		System.out.println("3  ����");
		System.out.println("4  ����");
		System.out.println("5  �˳�");
	}

	@Override
	public void addgoods(ArrayList<Shop> arrayList, Scanner sc) {
		System.out.println("��������Ҫ��������Ʒ");
		String next = sc.next();
		String[] split = next.split(",");

		if (split.length == 4) {
			Shop shop = new Shop();
			shop.setNum(split[0]);
			shop.setName(split[1]);
			shop.setPrice(Double.parseDouble(split[2]));
			shop.setAmount(Integer.parseInt(split[3]));

			arrayList.add(shop);
			System.out.println(shop);

		} else {
			System.out.println("��������ȷ�ĸ�ʽ");
		}
	}

	@Override
	public void stock(ArrayList<Shop> arrayList, Scanner sc) {

		System.out.println("��������Ʒ���");
		String n = sc.next();
		boolean isNo = true;
		for (int i = 0; i < arrayList.size(); i++) {
			if (n.equals(arrayList.get(i).getNum())) {
				System.out.println("���������������");
				int j = sc.nextInt();
				int k = arrayList.get(i).getAmount();
				k += j;
				arrayList.get(i).setAmount(k);
				System.out.println(arrayList.get(i).toString());
				isNo = false;
			}
		}
		if (isNo) {
			System.out.println("��Ҫ������Ʒ������");
		}

	}

	@Override
	public void market(ArrayList<Shop> arrayList, Scanner sc) {
		System.out.println("��������Ҫ���۵���Ʒ���");
		String m = sc.next();
		boolean isNo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (m.equals(arrayList.get(i).getNum())) {
				System.out.println("������Ҫ���۵�����");
				int j = sc.nextInt();
				int k = arrayList.get(i).getAmount();
				if (j < k) {
					k = k - j;
					arrayList.get(i).setAmount(k);
					System.out.println(arrayList.get(i).toString());
				} else {
					System.out.println("������㣬����ʧ��");
				}
				isNo = true;
			}
		}
		if (!isNo) {
			System.out.println("��Ҫ���۵���Ʒ������");
		}

	}

	@Override
	public void infoCommodity(ArrayList<Shop> arrayList) {
		for (Shop shop : arrayList) {
			System.out.println(shop.toString());
		}
	}

}
