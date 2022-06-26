package devXplore;

import java.util.Scanner;

public class MyClass {
	static int countOrdersDeliveredInAWeek(PackerAndMovers[] obj, String city) {
		
		int count=0;
		for(int i=0;i<obj.length;i++) {
			if(obj[i].getFromCity().equals(city)) {
				if(Integer.parseInt(obj[i].getDeliveryDate().substring(0,2)) - Integer.parseInt(obj[i].getOrderDate().substring(0,2))<7) {
					count++;
				}
			}
		}
		return count;		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		PackerAndMovers[] obj = new PackerAndMovers[4];
		
		for(int i=0;i<obj.length;i++) {
			
			obj[i] = new PackerAndMovers();
			
			obj[i].setInvoiceNo(sc.nextInt());
			obj[i].setFromCity(sc.next());
			obj[i].setToCity(sc.next());
			obj[i].setOrderDate(sc.next());
			obj[i].setDeliveryDate(sc.next());
			obj[i].setPrice(sc.nextDouble());
			
		}
		
		String city = sc.next();
		int ans = countOrdersDeliveredInAWeek(obj,city);	
		System.out.println(ans);
		
		sc.close();
	}

static class PackerAndMovers {
	
	private int invoiceNo;
	private String fromCity;
	private String toCity;
	private String orderDate; //dd-mm-yyyy
	private String deliveryDate;
	private double price;
	
	public int getInvoiceNo() {
		return invoiceNo;
	}


	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}


	public String getFromCity() {
		return fromCity;
	}


	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}


	public String getToCity() {
		return toCity;
	}


	public void setToCity(String toCity) {
		this.toCity = toCity;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public String getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public PackerAndMovers(int invoiceNo, String fromCity, String toCity, String orderDate, String deliveryDate,
			double price) {
		super();
		this.invoiceNo = invoiceNo;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.price = price;
	}


	public PackerAndMovers() {
		super();
	}
	
	
}

}