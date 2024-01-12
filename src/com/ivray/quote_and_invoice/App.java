package com.ivray.quote_and_invoice;

import java.time.LocalDate;

import business.Client;
import business.Document;
import business.Invoice;
import business.Quote;

public class App {

	public static void main(String[] args) {
		Client client1 = new Client("John Doe", "123 Main St", "555-555-5555");
		Client client2 = new Client("John Doe", "123 Main St", "555-555-5555");

		Document document1 = new Quote(client1, LocalDate.now().plusDays(30));
		Document document2 = new Invoice(client2, LocalDate.now().plusDays(25));

	}

}
