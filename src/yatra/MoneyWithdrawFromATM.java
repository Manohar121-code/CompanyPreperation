package yatra;

public class MoneyWithdrawFromATM {
	private final int STARTER = 40;
	public static void main(String[] args) {
		MoneyWithdrawFromATM obj = new MoneyWithdrawFromATM();
		int[] currencyArr = {2000, 500, 200, 100, 50, 20, 10};
		ATMLLNode head = obj.loadCurrencyIntoLinkedList(currencyArr);
		int withdrawMoney = 7700;
		if (obj.validateWithdrawMoney(head, withdrawMoney)) {
			obj.doOperation(head, withdrawMoney);
		} else {
			System.out.println("Enter valid amount");
		}
	}

	private void doOperation(ATMLLNode head, int withdrawMoney) {
		StringBuilder sb = new StringBuilder();
		while (withdrawMoney > 0 && head != null) {
			int required = Math.min(withdrawMoney / head.data, head.count);
			if (required > 0) {
				sb.append(head.data +" -> "+ required+"\n");
				withdrawMoney -= head.data * required;
				head.count -= required;
			}
			head = head.next;
		}
		System.out.println(withdrawMoney > 0 ? "ATM doesn't have entered amount. Please enter small amount" : sb.toString());
	}

	private boolean validateWithdrawMoney(ATMLLNode head, int withdrawMoney) {
		while (head != null && head.next != null) {
			head = head.next;
		}
		int minAmount = head.data;
		return withdrawMoney % minAmount == 0;
	}

	private ATMLLNode loadCurrencyIntoLinkedList(int[] currencyArr) {
		ATMLLNode head = new ATMLLNode(currencyArr[0], STARTER);
		ATMLLNode prevNode = head;
		for (int i = 1; i < currencyArr.length; i++) {
			ATMLLNode curr = new ATMLLNode(currencyArr[i], STARTER);
			prevNode.next = curr;
			prevNode = curr;
		}
		return head;
	}
}

class ATMLLNode {
	int data, count;
	ATMLLNode next;

	public ATMLLNode(int data, int count) {
		this.data = data;
		this.count = count;
		next = null;
	}
}