package org.example;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;

public class Sample05_UsingLambdaExpressions {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Eswar", 29), new Person("Eswar1", 30));

		list.stream()
			.sorted(comparing(Person::getAge).thenComparing(Person::getName).reversed())
			.forEach(System.out :: print);;
	}


	static class Person  {

		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}


	}
}

