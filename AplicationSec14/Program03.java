package AplicationSec14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import EntitiesSec14.Reservation;
import model.exceptions.DomainException;

public class Program03 {

	public static void main(String[] args) throws DomainException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Nro.do quarto : ");
			int number = sc.nextInt();
			System.out.println("Data do check-in : ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Data do check-out : ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println("");
			System.out.println("Entre com a data da atualização da reserva");
			System.out.println("Data do check-in : ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Data do check-out : ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.out.println("Formato invalido de data");
		}
		catch (DomainException e) {
			System.out.println("Erro na reserva : " + e.getMessage());
		}
	}
}