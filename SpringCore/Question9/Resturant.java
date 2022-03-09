package org.Lifecycle.spring;

public class Resturant {
	public void greetCustomer() {
		System.out.println("Welcome to the virtual resturant ");
	}
	public void init() {
		System.out.println("Resturant bean is going through init");
	}
	public void destroy() {
		System.out.println("Resturant bean is destroyed");

}
}
