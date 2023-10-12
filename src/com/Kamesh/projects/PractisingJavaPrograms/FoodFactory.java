package com.Kamesh.projects.PractisingJavaPrograms;

class FoodFactory {
	public Food getFood(String order) {

		if (order.equalsIgnoreCase("pizza")) {
			Food f = new Pizza();
			return f;
		}
		Food f1 = new Cake();
		return f1;
	}
}
