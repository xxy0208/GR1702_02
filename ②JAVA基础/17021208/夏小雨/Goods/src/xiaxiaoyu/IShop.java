package xiaxiaoyu;

import java.util.ArrayList;
import java.util.Scanner;

public interface IShop {
	void addgoods(ArrayList<Shop> arrayList, Scanner sc);

	void stock(ArrayList<Shop> arrayList, Scanner sc);

	void market(ArrayList<Shop> arrayList, Scanner sc);

	void infoCommodity(ArrayList<Shop> arrayList);
}
